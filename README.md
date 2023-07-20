# MileageTracker
A simple Android mileage tracker

Mileage tracker:
	Each record must contain:
		Vehicle ID (drop-down list of vehicles created in another screen)
		Odometer reading
		Date
		Fuel volume
		Fuel price per gallon
		Missed fill-up?	// Without this, a missed fill-up would make the mileage calculation higher.
	Each record may contains:
		Fuel grade (octane)
		Payment info (debit/credit/cash)
		Gas station brand
		Gas station address
		Partial fill-up?
	Calculated for each record:
		total cost
		mileage
