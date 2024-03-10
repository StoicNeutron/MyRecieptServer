<h1>My Receipt</h1>
<p>Hackathon's Prject. Location: George Mason University. <a href="https://www.hackfax.com/">HackFax</a> </p>

<p>My receipt is a project we came up to competed at the Hackathon. We won the 1st place on a <b>Start Up</b> track.</p>
<p>Interesting Fact: I always had this idea of creating an application where all your receipts are organize and manage within one place. Go paperless, no more massive amount of email and paper receipts within your email inbox.</p>

<h4>Note: My Receipt's architecture is fall into a Client Server architecture. This repository is just the server of the entire application.</h4>
<h4>For my privacy: I remove the database connection such as username and password. If you wish to run this on your local machine, additional config must be done.</h4>

## Endpoints

- Endpoint 1:
  - URL: `/v1/signup`
  - Method: POST
  - Description: create My Receipt user account with Username, Email, Password.
- Endpoint 2:
  - URL: `/v1/login`
  - Method: POST
  - Description: login to My Receipt user account with Email and Password.
- Endpoint 3:
  - URL: `/v1/send_receipt`
  - Method: POST
  - Description: For Collaboration with Companies. For them to send the user receipt directly to our server.
- Endpoint 4:
  - URL: `/v1/receipts/category`
  - Method: GET
  - Description: Use to fetch receipt data with specific category at the Frontend of our application.
 
<h6>Note: There a few more endpoints, but the above are the most important which we want to highlight.</h6>
