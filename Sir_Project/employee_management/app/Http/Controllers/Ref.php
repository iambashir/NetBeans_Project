foreach (Flight::all() as $flight) {
    echo $flight->name;
}
$flights = Flight::where('active', 1)
               ->orderBy('name')
               ->take(10)
               ->get();

$flight = Flight::where('number', 'FR 900')->first();

$freshFlight = $flight->fresh();

// Retrieve a model by its primary key...
$flight = Flight::find(1);

// Retrieve the first model matching the query constraints...
$flight = Flight::where('active', 1)->first();

// Alternative to retrieving the first model matching the query constraints...
$flight = Flight::firstWhere('active', 1);