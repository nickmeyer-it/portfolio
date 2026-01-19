# Enforce Password Policy on a User

## Scenario
Simulated applying a password policy to a Linux user to ensure account security and compliance.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Viewing current password aging settings
- Configuring password expiration
- Verifying password policy enforcement
- Ensuring least-privilege account security

## Implementation
Steps outlined below.

### Check current password settings
Note: 'chage' must be run using 'sudo', unless you 'su - username' the user account in-question.
```bash
chage -l username
```
<img width="1280" height="800" alt="2026-01-18 23_11_01-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/a43e49d5-5885-4555-a7f7-9c2ff0e607d2" />

### Set password expiration (example: 90 days)
```bash
sudo chage -M 90 username
sudo chage -m 7 username   # minimum days between changes
sudo chage -W 14 username  # warning days before expiration
```
<img width="1280" height="800" alt="2026-01-18 23_13_34-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/5dc31e06-acf2-492b-ad43-8e767db6aa25" />

### Verify policy
Output should reflect the updated expiration, minimum, and warning days.
Note: as mentioned above, 'chage' must be run using 'sudo', unless you 'su - username' the user account in-question.
```bash
sudo chage -l username
```
<img width="1280" height="800" alt="2026-01-18 23_19_48-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/d78371d7-2564-43d9-a1e2-8d8be1bfd53a" />

### Reflections on this lab
Password policy successfully applied to the user. Ensures the account meets security standards and promotes regular password updates, mirroring best practices in real IT environments.
