Feature: Reset functionality on login page of Application 

    Scenario: Verification of Reset button 
        Given Open the Firefox and launch the application			
        When Enter the Username and Password			
        Then Reset the credential

    Scenario: Looking for the Cheese
        Given Open Chrome set to google
        When Enter cheese into search
        Then Hit enter