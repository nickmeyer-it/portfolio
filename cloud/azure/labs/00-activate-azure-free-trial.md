# Lab 00 – Activating Azure Free Trial & Subscription Baseline

## Objective
Activate an Azure free trial subscription, verify access, establish cost guardrails, and document baseline subscription details.

This lab establishes the foundation for **all future Azure labs** and reinforces core Azure subscription and billing concepts.

---

## Azure Services / Features Used
- Azure Subscription
- Azure Portal
- Cost Management + Billing
- Azure Budgets
- Azure Cloud Shell

---

## Pre-Requisites
- Microsoft account
- Valid payment method (for verification only)
- Internet access

---

## Step-by-Step Actions

### 1. Activate Azure Free Trial
- Navigated to Azure free trial sign-up page
<img width="958" height="1039" alt="1" src="https://github.com/user-attachments/assets/2a68eabd-7f2d-4d15-bda0-1e39dfd19410" />
- Signed in with Microsoft account
<img width="950" height="955" alt="2" src="https://github.com/user-attachments/assets/d4cdec6b-5a12-4c06-9c08-b19b9557efbf" />
<img width="950" height="955" alt="3" src="https://github.com/user-attachments/assets/be1ab362-8a28-4d55-b489-3783acad39ee" />
- Completed identity verification
<img width="960" height="1040" alt="4" src="https://github.com/user-attachments/assets/4f2c7a72-7950-4521-bd68-7a7f289075b4" />
<img width="960" height="1040" alt="5" src="https://github.com/user-attachments/assets/6723d838-f3c2-414b-b407-dc94a90e2560" />
<img width="960" height="1040" alt="6" src="https://github.com/user-attachments/assets/e371887e-e749-465f-abda-1b56f4bb60aa" />
- Confirmed free credit amount and expiration date
<img width="960" height="1040" alt="7" src="https://github.com/user-attachments/assets/fac2fe82-e7aa-448d-9a55-715d4ca90bb4" />

**Notes:**

---

### 2. Verify Subscription Details
- Logged into Azure Portal
- Navigated to **Subscriptions**
<img width="960" height="1040" alt="1" src="https://github.com/user-attachments/assets/59eecc52-ae19-4f80-ab4a-eda371f11a8e" />
- Confirmed subscription is active
<img width="960" height="1040" alt="2" src="https://github.com/user-attachments/assets/e3ba2e9e-2880-43b3-953e-916b02b03965" />
- Recorded subscription name and ID
<img width="960" height="1040" alt="3" src="https://github.com/user-attachments/assets/34ee8404-994b-4de0-8f59-a85904ec48a9" />

**Subscription Info:**

---

### 3. Verify Tenant & Directory
- Navigated to Microsoft Entra ID (Azure AD)
- Verified tenant name
<img width="960" height="1040" alt="1" src="https://github.com/user-attachments/assets/e93d5ecc-281c-4ad4-babc-e3029b712834" />
- Verified primary domain
<img width="960" height="1040" alt="2" src="https://github.com/user-attachments/assets/139e1e61-fa1d-4ed0-960d-bac48f97a804" />
- Confirmed global admin access
<img width="960" height="1040" alt="3" src="https://github.com/user-attachments/assets/29d03197-adef-4271-812c-9809e7d8da8b" />

**Tenant Info:**

---

### 4. Enable Cloud Shell
- Opened Azure Cloud Shell
<img width="960" height="1040" alt="1" src="https://github.com/user-attachments/assets/007817fc-99c2-48e9-b960-e1849dac102b" />
- Selected Bash
<img width="949" height="298" alt="2" src="https://github.com/user-attachments/assets/757c8716-2edf-44d7-8903-da1e9ba7e483" />
- Selected No storage account required
<img width="949" height="298" alt="3" src="https://github.com/user-attachments/assets/3853a0e4-e0d6-4df5-8da7-3c64ad2aa654" />
- Successfully ran a test command
<img width="949" height="298" alt="4" src="https://github.com/user-attachments/assets/49f16ce6-d97f-4daf-811e-dff8b490b334" />
Test Command Output:
```bash
az account show
```
<img width="960" height="1040" alt="5" src="https://github.com/user-attachments/assets/1d7dedc6-50c5-4046-b500-70fedbfbf9bb" />

