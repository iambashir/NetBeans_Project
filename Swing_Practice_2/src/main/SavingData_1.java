
package main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "saving_data", catalog = "bashir_swing_practice_2", schema = "")
@NamedQueries({
    @NamedQuery(name = "SavingData_1.findAll", query = "SELECT s FROM SavingData_1 s")
    , @NamedQuery(name = "SavingData_1.findByRollNo", query = "SELECT s FROM SavingData_1 s WHERE s.rollNo = :rollNo")
    , @NamedQuery(name = "SavingData_1.findByName", query = "SELECT s FROM SavingData_1 s WHERE s.name = :name")})
public class SavingData_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "roll_no")
    private Integer rollNo;
    @Column(name = "name")
    private String name;

    public SavingData_1() {
    }

    public SavingData_1(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        Integer oldRollNo = this.rollNo;
        this.rollNo = rollNo;
        changeSupport.firePropertyChange("rollNo", oldRollNo, rollNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollNo != null ? rollNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SavingData_1)) {
            return false;
        }
        SavingData_1 other = (SavingData_1) object;
        if ((this.rollNo == null && other.rollNo != null) || (this.rollNo != null && !this.rollNo.equals(other.rollNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.SavingData_1[ rollNo=" + rollNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
