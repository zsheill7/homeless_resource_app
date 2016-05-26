package com.example.apple.homelessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import java.util.List;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import java.util.Scanner;
public class BuildingActivity extends AppCompatActivity {

    //public static int c = 2; //count the number of times for id



    //Scanner scan = new Scanner(System.in);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        int type = intent.getIntExtra(SelectionActivity.EXTRA_INT, -1);

        TextView myText = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);

        DBHandler db = new DBHandler(this);

        db.open();
        DBCreator.onCreate(db.mDb);
        //DBCreator.onCreate(sDb.mDb);
        //Inserting building/Rows
        Log.d("Insert: ", "Inserting...");
        db.addBuilding(new Building(3, 1, true, "Hope Place", "3800 S Othello St, Seattle, WA 98118", "(206) 723-0767", "info@hope.org", "5:00", "do this", "hope.org", "also do this"));
        db.addBuilding(new Building(1, 3, true, "Community Lunch on Capitol Hill", " 4205 Rainier Ave S, Seattle, WA 98118", "(206) 723-4105", "info@hope.org", "5:00", "do this", "hope.org", "also do this"));
        //db.addBuilding(new Building(4, 1, true, /*Name*/ "Sacred Heart Shelter", /*Address)*/ "232 Warren Ave N. Seattle, WA 98109", /*Phone*/ "(206)285-7489", /*Email*/ "ccskingcountyinfo@ccsww.org", /*Schedule*/ "", /*Description*/ "Emergency shelter for single women 18 and over and one or two-parent families with children under age 13. Single fathers with children okay.", /*Website*/ "http://www.ccsww.org/site/PageServer?pagename=homeless_sacredheart", /*Instructions for applying*/ "Call or email."));
        /*Latitude: 47.620699
        Longitude: -122.353726
        Any restrictions(gender, race, religion, or only for families/youth)? Single women or families with children under age 13*/


        db.addBuilding(new Building(4, 1, true, /*Name*/ "Salvation Army Women’s Shelter", /*Address)*/ "1101 Pike St. Seattle, WA 98101",
                /*Phone*/ "206-447-9944", /*Email*/ "noreply@salvationarmy.org", /*Schedule*/ "Tues-Wed 9-11:30 am, 1-3 pm, Thurs 1-5:45 pm, Fri 9-11:30 am, 1-3 pm",
                /*Description*/ "", /*Website*/ "", /*Instructions for applying*/ ""));
        /*Latitude: 47.606209
        Longitude: -122.332071
        Any restrictions(gender, race, religion, or only for families/youth)? Single women over 18*/


        db.addBuilding(new Building(5, 1, true, /*Name*/ "Adult Service Center (ASC)", /*Address)*/ "2015 3rd Ave Seattle, WA 98121",
                /*Phone*/ "206-357-3190", /*Email*/ "wheelorg@yahoo.com", /*Schedule*/ "", /*Description*/ "The Homeless Remembrance Project " +
                "Committee includes homeless women, professional landscape designers and artists, people from the faith community, social service providers, and other neighbors. " +
                "We’ve been working together since 2003 to create places of hope, healing and beauty to honor and remember homeless people who’ve died in King County.",
                /*Website*/ "http://fallenleaves.org/fasc/", /*Instructions for applying*/ ""));
        /*Latitude: 47.612523
        Longitude: -122.341737
        Any restrictions(gender, race, religion, or only for families/youth)? Adults 18+*/


                db.addBuilding(new Building(6, 1, true, /*Name*/ "Noel House Women’s Referral Center", /*Address)*/ "118 Bell Street Seattle, WA 98121",
                        /*Phone*/ "(206)441-3210", /*Email*/ "ccskingcountyinfo@ccsww.org", /*Schedule*/ "Daily 6-9 pm", /*Description*/
                        "The Women’s Referral Center is a safe, welcoming place where women can request shelter referrals and transportation to nightly shelters. Evening meals and hygiene services are also available." +
                                "", /*Website*/ "http://www.ccsww.org/site/PageServer?pagename=homeless_noelhouse", /*Instructions for applying*/ "Come in person"));
        /*Latitude: 47.613947
        Longitude: -122.346117
        Any restrictions(gender, race, religion, or only for families/youth)? Women 18+ only*/


        db.addBuilding(new Building(7, 1, true, /*Name*/ "YWCA Emergency Shelter", /*Address)*/ "1118 Fifth Ave. Seattle, WA 98101", /*Phone*/ "(206)461-4888",
                /*Email*/ "", /*Schedule*/ "", /*Description*/ "The YWCA provides a safe haven for women and their children fleeing domestic violence.  " +
                "We strive to give all clients the opportunity to find decent, affordable and safe housing for themselves and/or their children. This is a 45-day emergency shelter. " +
                "Clients have their own room and are encouraged to meet weekly with an advocate to address barriers they may have.", /*Website*/ "http://www.ywcaworks.org/", /*Instructions for applying*/ ""));
        /*Latitude: 47.607900
        Longitude: -122.332590
        Any restrictions(gender, race, religion, or only for families/youth)? Women with or without children*/


        db.addBuilding(new Building(8, 1, true, /*Name*/ "Compass Housing Alliance (Office)", /*Address)*/ "77 S Washington St Seattle, WA 98104",
                /*Phone*/ "(206)357-3100", /*Email*/ "", /*Schedule*/ "Client Services Office Mon-Fri 9am – 4pm. Hygiene Center Mon-Fri 7am – 2:30pm", /*Description*/ "Compass Housing Alliance provides housing, " +
                "shelter and support services to people experience homelessness and poverty in the Puget Sound Region.", /*Website*/ "http://www.compasshousingalliance.org/", /*Instructions for applying*/ ""));
        /*Latitude: 47.600704
        Longitude: -122.335293
        Any restrictions(gender, race, religion, or only for families/youth)? Adults 18+*/


                db.addBuilding(new Building(9, 1, true, /*Name*/ "Seattle’s Union Gospel Mission", /*Address)*/ "318 Second Ave. Ext. S Seattle, WA 98104", /*Phone*/ "206-622-5177", /*Email*/ "", /*Schedule*/ "",
                        /*Description*/ "", /*Website*/ "", /*Instructions for applying*/ ""));
        /*Latitude: 47.600543
        Longitude: -122.330583
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(10, 1, true, /*Name*/ "Bread of Life Mission", /*Address)*/ "97 South Main St Seattle, WA 98194", /*Phone*/ "206-682-3579", /*Email*/ "chelseap@breadoflifemission.org",
                /*Schedule*/ "Mon-Fri 9:30-3pm", /*Description*/ "DAY SHELTER: Mail Services, Lockers ($15 deposit, $20/month), coffee and pastries, television, metro bus passes, social services/referrals, " +
                "men’s and women’s clothing distribution.Hot lunch served Monday through Friday from 12:15-1 p.m. NIGHTLY SERVICES: 100 beds for emergency guests. We strive to keep a family atmosphere for the " +
                "men who come through our doors. Bed sign-up begins at 5 pm; doors close at 8:15pm.", /*Website*/ "http://www.breadoflifemission.org/", /*Instructions for applying*/ ""));
        /*Latitude: 47.599904
        Longitude: -122.334596
        Any restrictions(gender, race, religion, or only for families/youth)? Night shelter for men 18+ only. $5 fee and valid ID required.*/


                db.addBuilding(new Building(11, 2, true, /*Name*/ "SHARE", /*Address)*/ "1902 2nd Avenue Seattle, WA 98111", /*Phone*/ "(206) 448 7889", /*Email*/ "shelters@sharewheel.org", /*Schedule*/ "",
                        /*Description*/ "Seattle Housing and Resource Effort", /*Website*/ "http://www.sharewheel.org/", /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(12, 2, true, /*Name*/ "Snohomish County Human Services", /*Address)*/ "Department 3000 Rockefeller Ave. M/S 305, Everett WA 98201", /*Phone*/ "(425)388-7416",
                /*Email*/ "", /*Schedule*/ "Days Only", /*Description*/ "Services to help maintain elderly and disabled adults in their own home or in a community setting. " +
                "Drug and alcohol treatment for both youth and adults, mental health counseling, 24-hour services for persons in a mental health or drug and alcohol crisis, services to help low-income " +
                "households. An Early Childhood Education Program exists for low-income families with four-year old children, in addition to employment and community support programs for persons with developmental " +
                "disabilities and their families. Community programs for children and families, help for veterans, weatherization and help for low-income households to pay their heating bills.", /*Website*/ "http://www.snohomishcountywa.gov/191/Human-Services", /*Instructions for applying*/ ""));
        /*Latitude: 48.012743
        Longitude: -122.205112
        Any restrictions(gender, race, religion, or only for families/youth)? Open to all*/


        db.addBuilding(new Building(13, 2, true, /*Name*/ "Cocoon House Central", /*Address)*/ "2726 Cedar Street, Everett, Washington 98201", /*Phone*/ "425-259-3342",
                /*Email*/ "safeplace@cocoonhouse.org", /*Schedule*/ "", /*Description*/ "Cocoon House provides services to at-risk " +
                "and homeless teens in Snohomish County, WA. Cocoon House Central in Everett provides temporary housing for teens while Cocoon House Complex (a few blocks away) has " +
                "long-term housing", /*Website*/ "www.cocoonhouse.org", /*Instructions for applying*/ "Call or email"));
        /*Latitude: 47.980800
        Longitude: -122.194172
        Any restrictions(gender, race, religion, or only for families/youth)? Teens up to 18 allowed in housing, but aid available for up to age 24*/


        db.addBuilding(new Building(14, 2, true, /*Name*/ "Cocoon House U-Turn Drop In Center", /*Address)*/ "1421 Broadway Everett, Washington 98201",
                /*Phone*/ "425-877-5171", /*Email*/ "safeplace@cocoonhouse.org", /*Schedule*/ "Mon-Fri 2-6:30 pm, Sat-Sun 10-1 pm", /*Description*/ "Teens can come to hang out, " +
                "take a shower, get some food, talk to an adult, get help or connected with services. Access a place to sleep, do laundry, take a shower, eat, and get help getting a job.",
                /*Website*/ "www.cocoonhouse.org", /*Instructions for applying*/ "No application necessary"));
        /*Latitude: 47.998101
        Longitude: -122.200685
        Any restrictions(gender, race, religion, or only for families/youth)? Youth ages 12-20*/


        db.addBuilding(new Building(15, 2, true, /*Name*/ "Multi-Service Center & Shelter", /*Address)*/ "1200 S 336th St. Federal Way, WA 98003",
                /*Phone*/ "(253)838-6810", /*Email*/ "info@mschelps.org", /*Schedule*/ "", /*Description*/ "", /*Website*/ "www.mschelps.org", /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(16, 2, true, /*Name*/ "Seattle Indian Center", /*Address)*/ "1265 S. Main St. Seattle, WA 98144",
                /*Phone*/ "206-329-8700", /*Email*/ "", /*Schedule*/ "Mon-Fri 10 am-5 pm", /*Description*/ "Free, confidential counseling and wrap-around support for all " +
                "families in crisis. Safe after-school environment for kids grades 3-6. Laundry and shower facilities, Internet access, education plan assistance, job training, assessment " +
                "and case management, meals/food bank, clothing bank. Men’s hostel on site.", /*Website*/ "http://seattleindian.org/", /*Instructions for applying*/ ""));
        /*Latitude: 47.599758
        Longitude: -122.314479
        Any restrictions(gender, race, religion, or only for families/youth)? Open to everyone*/


        db.addBuilding(new Building(17, 2, true, /*Name*/ "Fresh Start Housing of Washington", /*Address)*/ "10924 Mukilteo Speedway, 230 Mukilteo, WA 98275",
                /*Phone*/ "(206)486-4493", /*Email*/ "info@freshstarthousingwa.org", /*Schedule*/ "", /*Description*/ "Supportive transitional housing for men and women " +
                "in various stages of life recovery from addiction, mental health issues, homelessness, and jail re-entry. Programs provided to help the residents acquire the skills necessary " +
                "to live independently. Team-building skills help each resident learn to work together with the other residents to maintain the home.", /*Website*/ "www.freshstarthousingwa.org/", /*Instructions for applying*/ "Application: http://www.freshstarthousingwa.org/documents/FS_HousingApp071615.pdf. May be completed online and emailed to exec.director@freshstarthousingwa.org or printed."));
        /*Latitude: 47.898598
        Longitude: -122.291993
        Any restrictions(gender, race, religion, or only for families/youth)?*/

        db.addBuilding(new Building(18, 2, true, /*Name*/ "Catholic Community Services Kent Family Center-ARISE", /*Address)*/ "1229 W Smith St. Kent, WA 98032",
                /*Phone*/ "253-854-0077", /*Email*/ "ccskingcountyinfo@ccsww.org", /*Schedule*/ "Mon and Wed 1 pm - 3 pm and 5 pm - 7 pm, Tues and Thurs 3 pm - 5 pm", /*Description*/
                "A dedicated case manager works closely with each member of the ARISE program. Shelter residents meet with the case manager to complete a needs assessment and develop individualized action plans. " +
                        "Based on the individual's need, men are connected to community resources such as housing, education, employment, medical and mental health services, veteran's services, chemical dependency and life " +
                        "skills services, such as basic budgeting and coping. ", /*Website*/ "http://www.ccsww.org/site/PageServer?pagename=homeless_arise", /*Instructions for applying*/ "Call"));
        /*Latitude: 47.383235
        Longitude: -122.249251
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(19, 2, true, /*Name*/ "St. Martin De Porres Shelter", /*Address)*/ "1561 Alaskan Way S, Seattle, WA 98134",
                /*Phone*/ "(206) 323-6341", /*Email*/ "", /*Schedule*/ "Daily convalescent medical care; night shelter 6:30 pm-7:30 am",
                /*Description*/ "Night shelter for men age 50+. Hot meals, clothing, medical care--transportation to and from medical appointments, laundry and shower facilities, housing case management, " +
                "drug and alcohol counseling. Library and chapel.", /*Website*/ "http://www.ccsww.org/site/PageServer?pagename=homeless_stmartin", /*Instructions for applying*/ "Call or visit Lazarus Day Center before 7 pm daily"));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)? Men over age 50*/


        db.addBuilding(new Building(20, 2, true,  /*Name*/ "Mamma’s Hands", /*Address*/ "27701 SE 26th Way Fall City, WA 98024",
                /*Phone*/  "206-915-2073", /*Email*/ "info@mammashands.org", /*Schedule*/ "", /*Description*/ "Mothers in crisis receive a safe and stable home, anchored by a " +
                "support system that helps them to regain hope, dignity and self-esteem, and to move toward a self-reliant future.", /*Website*/ "www.mammashands.org",
                /*Instructions for applying*/ "Application on website"));
                /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(21, 2, true,  /*Name*/ "Georgia’s House", /*Address*/ "4846 Auto Center Way Bremerton WA 98312",
                /*Phone*/  "360-479-9020", /*Email*/ "info@gmweaverfoundation.org", /*Schedule*/ "", /*Description*/ "Georgia's House is a shelter for low-income homeless women and children. " +
                "Clients are provided individualized case management, which involved the client in making decisions about the best course of action to get the client into permanent housing.",
                /*Website*/ "gmweaverfoundation.org", /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)?*/


        db.addBuilding(new Building(22, 2, true, /*Name*/ "Bremerton Oasis Teen Shelter", /*Address)*/
                "822 Burwell St. Bremerton WA 98337", /*Phone*/ "360-479-5123", /*Email*/ "jacob.wischoff@thecoffeeoasis.com",
                /*Schedule*/ "M-F 2-5 PM M&F Late Nights 6-9 PM", /*Description*/ "Fully licensed overnight shelter for homeless, runaway, and at risk teens.  " +
                "Assists youth in finding stable and permanent housing. Youth can access meals, hygiene, laundry, and needed resources.", /*Website*/ "https://thecoffeeoasis.com/real-hope/",
                /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)? Youth 13-17 years*/


        db.addBuilding(new Building(23, 2, true, /*Name*/ "Poulsbo Oasis Teen Shelter", /*Address)*/ "780 NE Iverson St. Poulsbo WA",
                /*Phone*/ "360-598-2091", /*Email*/ "verne.hemphill@thecoffeeoasis.com", /*Schedule*/ "M-F 2-5 PM M&F Late Nights 6-9 PM",
                /*Description*/ "Fully licensed overnight shelter for homeless, runaway, and at risk teens.  Assists youth in finding stable " +
                "and permanent housing. Youth can access meals, hygiene, laundry, and needed resources.", /*Website*/ "https://thecoffeeoasis.com/real-hope/",
                /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)? Youth 13-17 years*/


        db.addBuilding(new Building(24, 2, true, /*Name*/ "Port Orchard Oasis Center", /*Address)*/ "807A Bay St. Port Orchard, WA", /*Phone*/
                "360-602-0408", /*Email*/ "paul.morris@thecoffeeoasis.com", /*Schedule*/ "Mon-Fri 2-5 pm, Mon-Fri Late Nights 6-9 pm",
                /*Description*/ "Fully licensed overnight shelter for homeless, runaway, and at risk teens.  Assists youth in finding stable and permanent housing. " +
                "Youth can access meals, hygiene, laundry, and needed resources.", /*Website*/ "https://thecoffeeoasis.com/real-hope/", /*Instructions for applying*/ ""));
        /*Latitude:
        Longitude:
        Any restrictions(gender, race, religion, or only for families/youth)? Youth 13-17 years*/


        /*
        Food Banks
         */

        db.addBuilding(new Building(25, 2, true, /*Name*/ "Rainier Valley Food Bank",
                /*Address)*/ "205 Rainier Ave S, Seattle, WA 98118", /*Phone*/ "(206) 723-4105",
                /*Email*/ "info@rvfb.org", /*Schedule*/ "On-site food distribution: Wed and Sat 9:30 am-2 pm. " +
                "To-go food bags: Tues-Sat 7 am-2 pm.", /*Description*/ "On-site food distribution days for people wishing " +
                "to shop and select their own foods. To-go food bags for people without access to a kitchen " +
                "and in need of pre-prepared foods. Home delivery available for those with severe disability.",
                /*Website*/ "http://www.rvfb.org/", /*Instructions for applying*/ "No appointment necessary. If in need of home delivery, call or email"));
        /*Latitude: 47.540307
        Longitude: -122.271317
        Any restrictions(gender, race, religion, or only for families/youth)? Patrons may receive food one time a week. Bring own bags; ID helpful but not required. Inform line host of disabilities.*/


                db.addBuilding(new Building(26, 2, true, /*Name*/ "Volunteers of America Greenwood Food Bank", /*Address)*/
                        "9041 Greenwood AVE N", /*Phone*/ "206-782-6731", /*Email*/ "", /*Schedule*/
                        "Mon 3-7pm, Wed 1-5pm, Thurs 10am-12pm. Seniors/Disabled 12-3pm.  All 3rd Saturday of each month: 10am-2pm",
                                /*Description*/ "The VOA Greenwood Food Bank is open to serve individuals and families once each week. Emergency Bags can be provided after hours if staff is present as well as No-Cook bags for homeless individuals, infant formula and diapers, personal care products when available. Home delivery service for inbound seniors/disabled people that live within service boundaries.", /*Website*/ "http://www.foodpantries.org/li/volunteers-of-america-greenwood-food-bank", /*Instructions for applying*/ "Call for waiting list information"));
        /*Latitude: 47.695474
        Longitude: -122.355765
        Any restrictions(gender, race, religion, or only for families/youth)? Must bring photo ID and proof of address to receive full services. Availability is limited. May need to provide doctor verification for services.*/


                db.addBuilding(new Building(27, 2, true, /*Name*/ "North Helpline Food Bank", /*Address)*/ "12736 33rd Ave NE, Seattle, WA 98125", /*Phone*/ "(206) 367-3477", /*Email*/ "", /*Schedule*/ "Wed 10 am-1 pm, Thurs 4:30-6:30 pm, Sat 10 am-11 am (senior and disabled clients), 11 am-1 pm (all clients)", /*Description*/ "All clients can receive food from North Helpline Food Bank once each week during distribution hours. North Helpline works to ensure the best possible selection for clients. No-cook bags available for homeless clients once a day.", /*Website*/ "http://www.northhelpline.org/", /*Instructions for applying*/ "Register for food card"));
        /*Latitude: 47.722335
        Longitude: -122.291916
        Any restrictions(gender, race, religion, or only for families/youth)? Must register for food card beforehand: Adults 18+ must bring picture ID, proof of address, and proof of disability if applicable. Children under 18 just need some form of ID (ex driver’s license, school ID, passport).*/


        db.addBuilding(new Building(28, 2, true, /*Name*/ "Beacon Avenue Food Bank", /*Address)*/ "6230 Beacon Ave S, Seattle, WA 98108", /*Phone*/ "(206) 722-5105", /*Email*/ "", /*Schedule*/ "Wed and Fri 12-2pm", /*Description*/ "The mission of the Beacon Avenue Food Bank is to provide donated and purchased food to needy families at no cost. A Baby Cupboard is open once a month providing diapers and formula to families with infants.", /*Website*/ "http://volunteer.truist.com/uwkc/org/10544120704.html", /*Instructions for applying*/ ""));
        /*Latitude: 47.546688
        Longitude: -122.300132
        Any restrictions(gender, race, religion, or only for families/youth)? Open to all*/


        db.addBuilding(new Building(29, 2, true, /*Name*/ "Black Diamond Community Center Food Bank", /*Address)*/ "31605 3rd Ave, Black Diamond, WA, 98010",
                /*Phone*/ "360-886-1011", /*Email*/ "", /*Schedule*/ "Mon-Fri 9am-4pm", /*Description*/
                "Food bank for Black Diamond residents or residents of surrounding areas. Meals provided at limited times.",
                /*Website*/ "", /*Instructions for applying*/ ""));
        /*Latitude: 47.318348
        Longitude: -122.005449
        Any restrictions(gender, race, religion, or only for families/youth)? Serves residents of Black Diamond, Maple Valley, Ravensdale, Hobart, Selleck, Palmer, Cumberland, Kent (98042 only), Covington and surrounding areas.*/


                db.addBuilding(new Building(30, 2, true, /*Name*/ "Queen Anne Food Bank at Sacred Heart", /*Address)*/ "232 Warren Ave N, Seattle, WA 98109",
                        /*Phone*/ "(206) 216-4102", /*Email*/ "info@qafb.org",
                        /*Schedule*/ "Thurs 2-4 pm", /*Description*/
                        "Queen Anne Food Bank provides healthy food assistance to low-income and " +
                                "homeless people in Seattle. Our distribution is based on a consumer choice model. " +
                                "This system allows the customer to choose the food items they want. Some of the items commonly " +
                                "offered include grains, canned food, protein, dairy and fresh produce.", /*Website*/ "http://www.qafb.org/",
                        /*Instructions for applying*/ "Must provide proof of current address (ex. utility bill or rent receipt)."));
        /*Latitude: 47.620699
        Longitude: -122.353726
        Any restrictions(gender, race, religion, or only for families/youth)? Must live in one of the following zip codes: 98101, 98109, 98119, 98121.*/

        /*
        Meals (such as Community Lunch on Capitol Hill)
         */

        db.addBuilding(new Building(31, 2, true, /*Name*/ "Queen Anne Food Bank at Sacred Heart", /*Address)*/ "232 Warren Ave N, Seattle, WA 98109", /*Phone*/ "(206) 216-4102", /*Email*/ "", /*Schedule*/ "Mon-Thurs 8:30-11:30 am", /*Description*/ "The Queen Anne Food Bank Meal Program provides hot soup and a sack lunch to individuals in need. There are no eligibility requirements to qualify for this service.", /*Website*/ "http://www.qafb.org/", /*Instructions for applying*/ ""));
        /*Latitude: 47.620699
        Longitude: -122.353726
        Any restrictions(gender, race, religion, or only for families/youth)? Open to all*/

        db.addBuilding(new Building(32, 2, true, /*Name*/ "Black Diamond Community Center Food Bank", /*Address)*/ "31605 3rd Ave, Black Diamond, WA, 98010", /*Phone*/ "360-886-1011", /*Email*/ "", /*Schedule*/ "Tues, Thurs at 12 pm", /*Description*/ "Provides hot lunches for adults ages 60 and older; educational support and entertainment included.", /*Website*/ "", /*Instructions for applying*/ ""));
        /*Latitude: 47.318348
        Longitude: -122.005449
        Any restrictions(gender, race, religion, or only for families/youth)? Serves residents of Black Diamond, Maple Valley, Ravensdale, Hobart, Selleck, Palmer, Cumberland, Kent (98042 only), Covington and surrounding areas.*/


                Log.d("Reading: ", "Reading all buildings..");
        List<Building> buildings = db.getAllBuildings();

        for (Building building : buildings) {
            if (building.getType() == type) {
                String log = "Id: " + building.getId() + "Name: " + building.getName() + ", Address: " + building.getAddress() + ", Phone: " + building.getPhone() +
                        ", Email: " + building.getEmail() + ", Schedule: " + building.getSchedule() + ", Description" + building.getDescription() + ", Website" + building.getWebsite() + ", Instructions: " + building.getInstructions();
// Writing buildings to log
                Log.d("Building: : ", log);

                LinearLayout lView = (LinearLayout) findViewById(R.id.linearLayout);
                myText = new TextView(this);
                myText.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
                myText.setText(log);

                lView.addView(myText);
            }
        }

        
}}

