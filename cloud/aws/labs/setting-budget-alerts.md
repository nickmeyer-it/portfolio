# AWS Lab: Setting Up Budgets & Billing Alerts

## Lab Overview
In this lab, I configured an **AWS Budget** and **budget alerts** to monitor and control AWS spending.  
This lab helps reinforce cost management concepts relevant to the **AWS Cloud Practitioner (CLF-C02)** exam and real-world usage.

---

## Objectives
By the end of this lab, I will be able to:
- Enable billing access in the AWS Console
- Create a monthly cost budget
- Configure threshold-based alerts
- Understand how AWS notifies users of budget breaches

---

## AWS Services Used
- AWS Billing & Cost Management
- AWS Budgets
- Amazon SNS (for notifications)

---

## Prerequisites
- An AWS account (root or IAM user with billing access)
- Access to the AWS Management Console
- A valid email address for alert notifications

---

## Estimated Cost
- **$10.00**
> AWS Budgets includes 2 free budgets per month. Additional budgets may incur a small charge.

---

## Estimated Time
- 15–20 minutes

---

### Begin logging in to AWS using your root account
- This would also be a good time to setup a 'Free Tier' AWS account if you would like to follow along more closely.
<img width="1323" height="858" alt="2026-01-29 22_58_09-AWS Management Console — Mozilla Firefox" src="https://github.com/user-attachments/assets/0d19b53c-0df7-4b10-8c68-f005dfc340f0" />
<img width="1323" height="858" alt="2026-01-29 23_01_43-Amazon Web Services Sign-In — Mozilla Firefox" src="https://github.com/user-attachments/assets/6fa76c84-c225-46a9-9b79-ee536140faf5" />
<img width="1323" height="858" alt="2026-01-29 23_02_48-Amazon Web Services Sign-In — Mozilla Firefox" src="https://github.com/user-attachments/assets/93dde4cd-92cf-4ca5-84ce-4e184b90a0db" />
<img width="1323" height="858" alt="2026-01-29 23_03_43-Amazon Web Services Sign-In — Mozilla Firefox" src="https://github.com/user-attachments/assets/6ec07365-599f-4f39-8b22-02b1848f4921" />

### Perform MFA
- I've set it up using Google Authenticator in this case.
<img width="1323" height="858" alt="2026-01-29 23_05_13-Amazon Web Services Sign-In — Mozilla Firefox" src="https://github.com/user-attachments/assets/34f66e00-e01f-467b-8e81-03e5badd0776" />

### Search for Billing and Cost Management
- Use the search bar up top to search for Billing and Cost Management.
<img width="1323" height="858" alt="2026-01-29 23_06_48-Console Home _ Console Home _ us-east-1 — Mozilla Firefox" src="https://github.com/user-attachments/assets/f41fc553-2d43-4826-9807-f9a2978a2399" />
<img width="1323" height="858" alt="2026-01-29 23_08_08-Console Home _ Console Home _ us-east-1 — Mozilla Firefox" src="https://github.com/user-attachments/assets/41337224-28c6-41b3-bf9b-64491065ba04" />

### Navigate to Budgets
<img width="1323" height="858" alt="2026-01-29 23_15_27-Billing and Cost Management _ Global — Mozilla Firefox" src="https://github.com/user-attachments/assets/7c9734b5-7f0d-43c9-b178-5b6b082b536b" />

### Inspect the New Budget
- I've already created a budget, so we'll click the current budget to investigate how it was configured.
<img width="1339" height="789" alt="2026-01-29 22_35_06-Overview _ AWS Budgets _ Global — Mozilla Firefox" src="https://github.com/user-attachments/assets/2d04aa77-4c0a-4729-ab7a-8e25f746c310" />

### Inspect the Budget Cap
- You can see I've put an aggressive cap on the budget, but luckily it refreshes monthly.
<img width="1321" height="787" alt="2026-01-29 22_38_05-Budget details _ AWS Budgets _ Global — Mozilla Firefox" src="https://github.com/user-attachments/assets/f0991084-15e7-4e00-912a-d58f6261333b" />

### Inspect Budget Alerts
- If you keep scrolling you'll see Alerts.
- In this case we'll investigate how I've configured alerts for my existing monthly budget.
<img width="1323" height="817" alt="2026-01-29 22_47_01-Budget details _ AWS Budgets _ Global — Mozilla Firefox" src="https://github.com/user-attachments/assets/ebd62b5f-972c-41f3-a8bc-b8a7887c4736" />

- Here you can see I've set my budget alert to trigger when the 'actual' budget-use reaches 85% of the budget cap.
- And you can see that when it's triggered it knows to send me and email to let me know.
<img width="1323" height="817" alt="2026-01-29 22_48_33-Edit budget _ Configure alerts _ AWS Budgets _ Global — Mozilla Firefox" src="https://github.com/user-attachments/assets/c657c0f9-66a1-478c-99b9-7ac8a1e58602" />

### Reflection on this lab
As I learn more about Amazon Web Services, and the checks and balances that mitigate much of the scare-factor typical consumers might rationally worry about when it comes to 'cloud computing', I can't help but admire the simplicity of it all. 
