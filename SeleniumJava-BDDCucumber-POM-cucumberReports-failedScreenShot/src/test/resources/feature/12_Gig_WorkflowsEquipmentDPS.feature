Feature: Gig Workflows as a Equipment role

  @TestCase44745
  Scenario Outline: Completed all the the five steps on Gig Worflow Landing page
    Given validate user login as a "<equipment>" role
    Then validate user select newly created project card
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
    And user select activity information
      | Activity             |
      | Activity Information |
    #And user click edit button to edit existing details.
    And user fill activity information form
    And user select Customize Fragnet
      | Activity          |
      | Customize Fragnet |
    #And user click edit button and change fileds on customize fragnet page
    And user click save continue button
    And user select FragnetStepInformation tab
      | Activity                |
      | FragnetStep Information |
    #And user click edit button and change fileds on FragnetStepInformation
    And user click save continue button
    And User selects Stepfour Customize Gignet
    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Prepare & Issue Mech Equip Data Sheets Rev 0 |
      | Update & Issue Mech Equip Data Sheets Rev 1  |
      | Update & Issue Mech Equip Data Sheets Rev 2  |
    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Prepare & Issue Mech Equip Data Sheets Rev 0 | Review Process Datasheets,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE                                                                                                                                                         |
      | Update & Issue Mech Equip Data Sheets Rev 1  | Review Process Datasheets,Tanks 2D CAD Sketches,Vessels 2D CAD Sketches,Heat Exchanger 2D CAD Sketches,3D Modeling And Asme Code Calculations,HTRI Modeling And Code Calculations,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE |
      | Update & Issue Mech Equip Data Sheets Rev 2  | Review Process Datasheets,Tanks 2D CAD Sketches,Vessels 2D CAD Sketches,Heat Exchanger 2D CAD Sketches,3D Modeling And Asme Code Calculations,HTRI Modeling And Code Calculations,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE |

    Examples: 
      | equipment        |
      | equipment@bv.com |
