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

Metadata
"Android Version","aCar Version","aCar Build Date","aCar Database Version","Export Date/Time","Export Version","Minimum Supported aCar Version","Date Format","Time Format"
"13","5.4.3","07/11/2023","18","07/20/2023 - 13:55","11","5.0.0","M/d/yyyy","HH:mm"

Vehicles
"Name","Type","Year","Make","Model","SubModel","Engine","Transmission","Drive Type","Body Type","Bed Type","Active","License Plate","VIN","Insurance Policy","Color","Fuel Tank Capacity","Volume Unit","Distance Unit","Country","Region","City","Notes"
"Altima","CAR","2012","Nissan","Altima","S","2.5L L4 GAS","Automatic","FWD","Sedan","","Yes","F96 2HK","1N4AL2AP9CC248968","","","20.0","US_GALLON","MILE","United States","Utah","Orem",""

Fill-Up Records
"Vehicle","Date","Time","Odometer Reading","Distance Unit","Volume","Volume Unit","Price per Unit","Total Cost","Payment","Partial Fill-Up?","Previously Missed Fill-Ups?","Fuel Efficiency","Fuel Efficiency Unit","Fuel Category","Fuel Type","Has Fuel Additive?","Fuel Additive Name","Fuel Brand","Fueling Station Address","Place Street","Place City","Place State","Place Country","Place Postal Code","Place Latitude","Place Longitude","Device Latitude","Device Longitude","Driving Mode","City Driving Percentage","Highway Driving Percentage","Average Speed","Tags","Notes"

Event Records
"Vehicle","Date","Time","Odometer Reading","Distance Unit","Type","Sub Types","Total Cost","Payment","Place Name","Place Address","Place Street","Place City","Place State","Place City","Place Country","Place Postal Code","Place Latitude","Place Longitude","Device Latitude","Device Longitude","Tags","Notes"

Trip Records
"Vehicle","Start Date","Start Time","Start Odometer Reading","Start Location","End Date","End Time","End Odometer Reading","End Location","Start Latitude","Start Longitude","End Latitude","End Longitude","Distance Unit","Distance","Duration","Type","Purpose","Client","Tax Deduction Rate","Tax Deduction Amount","Reimbursement Rate","Reimbursement Amount","Paid","Tags","Notes"
