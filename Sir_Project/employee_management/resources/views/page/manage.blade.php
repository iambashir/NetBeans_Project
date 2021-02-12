

<section id="basic-form-layouts">
    <div class="row match-height">
        <!-- Table head options with primary background start -->
        <div class="row">
            <div class="col-xs-12">
                <div class="card">
                    <jsp:include page="/WEB-INF/view/common/cardheader.jsp" />
                    <div class="card-body collapse in">.
                        <div class="row">
                            <button type="button" class="btn btn-info mr-1" style="margin-left:31px" id="btnAdd" data-toggle="modal" data-target="#defaultSize">
                                <i class="icon-plus4"></i>
                            </button>
                        </div>
                        <br>
                        <div class="table-responsive">

                            <table class="table dataTables_wrapper container-fluid dt-bootstrap4 table-hover no-footer" id="serviceList">
                                <thead class="">
                                <tr>

                                    <th>Name</th>
                                    <th>Status</th>
                                    <th>Type</th>
                                    <th>Module</th>
                                    <th>Section</th>
                                    <th>Link</th>
                                    <th>Status</th>
                                    <th style="text-align:center">Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                @foreach($pages as $page)
                                    <tr class="odd">

                                        <td scope="row">{{$page->page_name}}</td>
                                        <td scope="row">{{$page->page_status}}</td>
                                        <td scope="row">{{$page->page_type}}</td>
                                        <td scope="row">{{$page->module_name}}</td>
                                        <td scope="row">{{$page->section_name}}</td>
                                        <td scope="row">{{$page->page_link}}</td>
                                        <td scope="row">{{$page->page_status}}</td>

                                        <td scope="row" style="text-align:center; display: inline-flex;">
                                            <button type="button" class="btn btn-success mr-1" onclick="editRow(this);">
                                                <i class="icon-square-check"></i>
                                            </button>
                                            <button type="button" class="btn btn-warning mr-1" onclick="deleteRow(this);">
                                                <i class="icon-trash4"></i>
                                            </button>

                                            <input type="hidden" name="service_id[]" class="service-id" value="{{$page->id}}" />
                                            <input type="hidden" name="service_code[]" class="service-code" value="{{$page->page_code}}" />
                                            <input type="hidden" name="service_name[]" class="service-name" value="{{$page->page_name}}" />
                                            <input type="hidden" name="service_type[]" class="service-type" value="{{$page->page_type}}" />
                                            <input type="hidden" name="service_status[]" class="service-status" value="{{$page->page_status}}" />
                                            <input type="hidden" name="service_link[]" class="service-link" value="{{$page->page_link}}" />
                                        </td>
                                    </tr>
                                @endforeach
                                </tbody>
                            </table>
                        </div>
                        {{--                     		                      <div class="form-actions right">--}}
                        {{--                            <button type="button" class="btn btn-warning mr-1">--}}
                        {{--                                <i class="icon-cross2"></i> Cancel--}}
                        {{--                            </button>--}}
                        {{--                            <ju:Submit name="Save" cssClass="save btn btn-primary saveBtn" spanClass="save" />--}}

                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal text-xs-left search-modal" id="serviceModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel18" aria-hidden="true">
        <div class="modal-dialog" role="document">

            <form method="post">
                @csrf

                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="serviceModalLabel"><i class="icon-tree"></i></h4>
                    </div>
                    <div class="modal-body">

                        <div class="form-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="privCode">Priviledge Code</label>
                                        <input type="text" id="privCode" class="form-control" placeholder="" name="page_code">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="privName">Priviledge Name</label>
                                        <input type="text" id="privName" class="form-control" placeholder="" name="page_name">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="privLink">Priviledge Link</label>
                                <input type="text" id="privLink" class="form-control" placeholder="" name="page_link">
                            </div>


                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="privType">Priviledge Type</label>
                                        <select id="privType" name="page_type" class="form-control">
                                            <option value="Entity">Entity</option>
                                            <option value="Service">Service</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- <div class="col-md-6">
                                   <div class="form-group">
                                       <label for="roleCode">Priviledge Operation Role</label>
                                       <select id="roleCode" name="roleCode" class="form-control">
                                           <c:forEach var="listValue" items="${data.role}">
                                               <option value="${listValue.roleId}">${listValue.roleName}</option>
                                           </c:forEach>
                                       </select>
                                   </div>
                               </div>  -->

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="roleCode">Priviledge Operation Role</label>
                                        <select id="roleCode" name="page_op_role" class="form-control">
                                            <option value="ROLE_ADMIN">ROLE_ADMIN</option>
                                            <option value="ROLE_USER">ROLE_USER</option>
                                            <option value="ROLE_FACULTY">ROLE_FACULTY</option>
                                            <option value="ROLE_STUDENT">ROLE_STUDENT</option>
                                        </select>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="module_code">Module Name</label>
                                        <select id="module_code" name="module_code" class="form-control">
                                            @foreach($modules ?? '' as $module)
                                                <option value="{{$module->module_code}}">{{$module->module_name}}</option>
                                            @endforeach
                                        </select>
                                        <input type="hidden" name="module_name"/>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="section_code">Section Name</label>
                                        <select id="section_code" name="section_code" class="form-control">
                                        </select>
                                        <input type="hidden" name="section_name"/>
                                    </div>
                                </div>
                            </div>

                            <!--<h4 class="form-section"><i class="icon-clipboard4"></i> Requirements</h4>-->

                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="email">Priviledge Status</label>
                                        <select id="privStatus" name="page_status" class="form-control">
                                            <option value="Active">Active</option>
                                            <option value="Inactive">Inactive</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="contactNumber">Priviledge OP Mode</label>
                                        <select id="privMode" name="page_op_mode" class="form-control">
                                            <option value="CREATE">CREATE</option>
                                            <option value="MANAGE">MANAGE</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="contactNumber">Priviledge Icon</label>
                                        <input type="text" id="privIcon" class="form-control" placeholder="" name="page_icon">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="email">Super User</label>
                                        <div class="input-group" style="margin-left: 3px">
                                            <label class="display-inline-block custom-control custom-radio">
                                                <input type="radio" name="page_super_enabled"  class="custom-control-input">
                                                <span class="custom-control-indicator"></span>
                                                <span class="custom-control-description ml-0">Yes</span>
                                            </label>
                                            <label class="display-inline-block custom-control custom-radio">
                                                <input type="radio" name="page_super_enabled" checked class="custom-control-input">
                                                <span class="custom-control-indicator"></span>
                                                <span class="custom-control-description ml-0">No</span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <label for="contactNumber">Favorite</label>
                                        <div class="input-group" style="margin-left: 3px">
                                            <label class="display-inline-block custom-control custom-radio">
                                                <input type="radio" name="page_fav_enabled"  class="custom-control-input">
                                                <span class="custom-control-indicator"></span>
                                                <span class="custom-control-description ml-0">Yes</span>
                                            </label>
                                            <label class="display-inline-block custom-control custom-radio">
                                                <input type="radio" name="page_fav_enabled" checked class="custom-control-input">
                                                <span class="custom-control-indicator"></span>
                                                <span class="custom-control-description ml-0">No</span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <div class="form-check" style="margin-top: 20px;">
                                            <label class="container-checkbox" style="font-size: 10pt;">
                                                <input type="checkbox" class="checkbox" name="page_otp_enabled" id="otpEnabled">OTP Enabled
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="form-group">
                                <label for="desc">Description</label>
                                <textarea id="desc" rows="4" class="form-control" name="page_desc" placeholder=""></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-warning mr-1">
                            <i class="icon-cross2"></i> Cancel
                        </button>
                        <button type="submit" class="btn btn-primary">Save</button>
                        <input id="form_action" value="">
                    </div>
                </div>

            <form>

        </div>
    </div>



    </div>
</section>
<!-- Table head options with primary background end -->




<script type="text/javascript">

    InitHandlers();

    $(document).ready(function(){


        $("form").on("submit", function(event){
            event.preventDefault();
            var formValues= $(this).serialize();
            $.post("{{ route('page.store') }}", formValues, function(data){
                if (data.success == true) {
                    ShowSuccessMsg('Success', data.message);
                    $("form").trigger("reset");
                    setSection();
                    HideModal("search-modal");
                    isDirty = false;
                    //var newCompanyCode = data.data.companyCode;
                    //LoadMainContent('service/create');
                    //newRowCount = null;
                } else {
                    //ShowErrorMsg('${map.glYearClosingActivityEditErrorMsgTitle}', data.message);
                    //errorShow(data.error);
                    //dataError = data.error;
                }
            });
        });

    });



    function showMessage(data) {
        if (data.outcome == 'success') {
            console.log('.......................sssssssscccccccccssssss');
            ShowSuccessMsg('Priviledge created !', data.message);
            HideModal("search-modal");
            //isDirty = false;
            //var newCompanyCode = data.data.companyCode;
            LoadMainContent('service/create');
            //newRowCount = null;
        } else {
            //ShowErrorMsg('${map.glYearClosingActivityEditErrorMsgTitle}', data.message);
            //errorShow(data.error);
            //dataError = data.error;
        }
    }



    $("#btnAdd").on("click", function(){
        ResetInputs("#serviceModal");
        $("#serviceModal").modal("show");
        $("#serviceModalLabel").text("Create Service");
        $("#form_action").val("create");
        console.log($("#form_action").val());
    })


    var editEl;
    var editRow = function(el){
        $(".modal-title").text('Edit Service');
        $(".alert").empty().addClass("hidden");

        ResetInputs("#serviceModal");
        editEl = $(el).closest("tr").index();
        $("#serviceModal tr").removeClass("current-row");
        $(el).closest("tr").addClass("current-row");

        $("#privCode").val($(el).closest("tr").find(".service-code").val());
        $("#privName").val($(el).closest("tr").find(".service-name").val());
        $("#privType").val($(el).closest("tr").find(".service-type").val());
        $("#privStatus").val($(el).closest("tr").find(".service-status").val());
        $("#privLink").val($(el).closest("tr").find(".service-link").val());

        $(".btnChk").removeClass("saveBtn");
        $(".btnChk").addClass("updateBtn");

        $("#serviceModal").modal('show');
        $("#form_action").val("edit");
        $(".modal-backdrop.fade.in").off("click");
        $(".modal").off("keydown");
        console.log($("#form_action").val());


    };



    $(".updateBtn").on("click", function(){


    })


    /*
        $('[name="suiteName"]').change(function(){
              // change the form around, run your query…

              $("suiteCode").val(this.val());
              $("suiteIcon").val(this.val());
        })

            $('[name="moduleName"]').change(function(){
              // change the form around, run your query…

              $("moduleCode").val(this.val());
              $("moduleIcon").val(this.val());
        }) */
</script>




