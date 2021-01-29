# Lab 3.8
Labs are mandatory and must be completed before the start of the next class.

You make work collaboratively with your classmates, but you may not copy and paste another students code.

## INSTRUCTIONS
Create a new github repository named Enterprise-Java-Development-3.8

Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assigment.

If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.

Upload the code for all of the following prompts to your repository.

## SPECIFICATIONS
1. Using Spring JPA model the relationships of the below application:

    Assume that you are working with an Association of Nurses. They need to model the association and its members.

    - The Association has 7 Chapters. Each Chapter has a name, a district, a president (which is a Member), and a list of Members
    - Each Member has a name, a status (ACTIVE or LAPSED), and a renewal date.

2. Using Spring JPA model the relationships of the below application:

    Assume that you are working with an Event Management company. They need to model upcoming events.

    - Each event has a date, a duration, a location, a title, and a list of Guests.
    - Each Guest has a name and a status (ATTENDING, NOT_ATTENDING, NO_RESPONSE)
    - There are two types of events: Conferences and Expositions. In addition to the typical Event properties, Conferences also have a list of Speakers.
    - Speakers have a name and presentationDuration.
