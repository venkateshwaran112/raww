Feature: Puma Account Creation
@acc
Scenario Outline: Account creation
    Given User enter the url click create and account page
    When user enter Personal Information "<Firstname>" and "<Lastname>"  
    And User has to enter the Sign in information "<E_mail>" "<pwd>" "<cnfrm_pwd>"
    And click create account
    

    Examples: 
      | Firstname   | Lastname | E_mail                | pwd         | cnfrm_pwd   |
      |  iewani     | raani    |iwereniraani@gmail.com |Vaaniraani@gm|Vaaniraani@gm|
      |  ewiojisu   | dhunivu  |iwerthunivu@gmail.com  |Varthunivu@gm|Varthunivu@gm|
      #|  kjwefhiva  | dr       |iwerelivadr@gmail.com  |sivadr       |sivadr       |
      #|  sethu      | junga    |iwerfthujunga@gmail.com|Sethujunga@gm|Sethujunga@gm|
      
