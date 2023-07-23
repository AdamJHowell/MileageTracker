# MileageTracker
A simple Android mileage tracker

```
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
```

Metadata
```
{
    "Android Version": "13",
    "aCar Version": "5.4.3",
    "aCar Build Date": "07/11/2023",
    "aCar Database Version": "18",
    "Export Date/Time": "07/20/2023 - 13:55",
    "Export Version": "11",
    "Minimum Supported aCar Version": "5.0.0",
    "Date Format": "yyyy-MM-dd",
    "Time Format": "HH:mm"
}
```

Vehicles
```
{
    "Name": "Altima",
    "Type": "CAR",
    "Year": "2012",
    "Make": "Nissan",
    "Model": "Altima",
    "SubModel": "S",
    "Engine": "2.5L L4 GAS",
    "Transmission": "Automatic",
    "Drive Type": "FWD",
    "Body Type": "Sedan",
    "Bed Type": "",
    "Active": "Yes",
    "License Plate": "F96 2HK",
    "VIN": "1N4AL2AP9CC248968",
    "Insurance Policy": "",
    "Color": "Gray",
    "Fuel Tank Capacity": "20.0",
    "Volume Unit": "US_GALLON",
    "Distance Unit": "MILE",
    "Country": "United States",
    "Region": "Utah",
    "City": "Orem",
    "Notes": ""
}
```

Fill-Up Records
```
{
    "Vehicle": "Altima",
    "Date": "7/15/2023",
    "Time": "08:11",
    "Odometer Reading": "106,421",
    "Distance Unit": "mi",
    "Volume": "20.101",
    "Volume Unit": "gal",
    "Price per Unit": "$3.969",
    "Total Cost": "$79.78",
    "Payment": "Zion's Joint Checking",
    "Partial Fill-Up?": "No",
    "Previously Missed Fill-Ups?": "No",
    "Fuel Efficiency": "23.332",
    "Fuel Efficiency Unit": "MPG",
    "Fuel Category": "Gasoline",
    "Fuel Type": "Gasoline - Regular (87)",
    "Has Fuel Additive?": "No",
    "Fuel Additive Name": "",
    "Fuel Brand": "Maverik",
    "Fueling Station Address": "24 S Geneva Rd Vineyard, UT 84058",
    "Place Street": "24 S Geneva Rd",
    "Place City": "Vineyard",
    "Place State": "UT",
    "Place Country": "USA",
    "Place Postal Code": "84059",
    "Place Latitude": "",
    "Place Longitude": "",
    "Device Latitude": "40.29654778",
    "Device Longitude": "-111.73476973",
    "Driving Mode": "Normal",
    "City Driving Percentage": "50",
    "Highway Driving Percentage": "50",
    "Average Speed": "",
    "Tags": "",
    "Notes": ""
}
```

Event Records
```
{
    "Vehicle": "Altima",
    "Date": "5/14/2022",
    "Time": "10:43",
    "Odometer Reading": "93,600",
    "Distance Unit": "mi",
    "Type": "Service",
    "Sub Types": "Engine Oil, Oil Filter",
    "Total Cost": "$22.00",
    "Payment": "Zion's Joint Checking",
    "Place Name": "Home",
    "Place Address": "",
    "Place Street": "639 S 1810 W",
    "Place City": "Orem",
    "Place State": "UT",
    "Place Postal Code": "84059",
    "Place Country": "USA",
    "Place Latitude": "40.2855519",
    "Place Longitude": "-111.73859399",
    "Device Latitude": "40.2855519",
    "Device Longitude": "-111.73859399",
    "Tags": "",
    "Notes": ""
}
```

Trip Records
```
{
    "Vehicle": "Altima",
    "Start Date": "5/14/2022",
    "Start Time": "10:43",
    "Start Odometer Reading": "93,600",
    "Start Location":
    "End Date": "5/14/2022",
    "End Time": "10:44",
    "End Odometer Reading": "93,601",
    "End Location":
    "Start Latitude": "40.2855519",
    "Start Longitude": "-111.73859399",
    "End Latitude": "40.2855519",
    "End Longitude": "-111.73859399",
    "Distance Unit": "mi",
    "Distance": "50.1",
    "Duration": "",
    "Type": "Vacation",
    "Purpose": "",
    "Client": "",
    "Tax Deduction Rate": "",
    "Tax Deduction Amount": "",
    "Reimbursement Rate": "",
    "Reimbursement Amount": "",
    "Paid": "",
    "Tags": "",
    "Notes": ""
}
```
