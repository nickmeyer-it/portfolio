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

### Set password expiration (example: 90 days)
```bash
sudo chage -M 90 username
sudo chage -m 7 username   # minimum days between changes
sudo chage -W 14 username  # warning days before expiration
```

### Verify policy
Output should reflect the updated expiration, minimum, and warning days.
```bash
sudo chage -l username
```

### Reflections on this lab
Password policy successfully applied to the user. Ensures the account meets security standards and promotes regular password updates, mirroring best practices in real IT environments.
