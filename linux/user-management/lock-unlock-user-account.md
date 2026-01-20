# Lock and Unlock a Linux User Account

## Scenario
Simulated temporarily disabling and re-enabling a Linux user account for security or administrative reasons.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Locking a user account
- Unlocking a user account
- Verifying account status
- Validating access control

## Implementation
Steps outlined below.

### Lock the user account
```bash
sudo usermod -L username
```

### Verify account is locked
```bash
sudo passwd -S username
```
Status should show L (locked).

### Unlock the user account
```bash
sudo usermod -U username
```

### Verify account is unlocked
```bash
sudo passwd -S username
```
Status should show P (password set).
<img width="1280" height="800" alt="2026-01-19 20_38_56-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/b080cbec-f059-4c08-bf0e-48c99a092f4e" />
