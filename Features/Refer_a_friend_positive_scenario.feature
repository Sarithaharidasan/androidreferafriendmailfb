Feature: Test refer a friend positive functionality

  #User must click on the refer a friend and navigated to refer a friend page
  Scenario: Validate that user can able to view Refer a Friend under Home page
    Given launch the URL
    When  Login with valid data
    Then verify Tell your friends about Mpowered Health text and logo is displayed

  Scenario: Validate that user can able to click on Refer a Friend button
    When clicks on Refer a Friend
    Then navigated to Refer a Friend landing page
    And verify referral code text is displayed
    
    Scenario: Validate Pop Up box when clicked on 'Facebook'
    When clicks on 'Share Link' button
    Then clicks on 'Facebook'
    And clicks on 'Post'
    

Scenario: Validate Pop Up box when clicked on 'Mail'
    When clicks on 'Share Link' button
    Then clicks on 'Mail'
    And verify mail is open
    
Scenario: Validate that the user should able to send refer a friend link via Mail 
   When Login with valid mail and password
   Then clicks on 'send' 
   
  Scenario: Validate that user can able to slide the two grids visible under How its works
    Given verify Invite your friends to Mpowered Health is displayed
    When clicks to slide the gird
    Then navigated to next slide

  Scenario: Validate that user can clicks on the link More information & FAQ and navigated to Frequently asked questions page
    When clicks on the link More information & FAQ
    Then verify list of Frequently asked questions