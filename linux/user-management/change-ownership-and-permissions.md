# Change File Ownership and Permissions

## Scenario
Simulated correcting file ownership and permissions to ensure proper access control.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Viewing file ownership and permissions
- Changing file and group ownership
- Modifying file permissions
- Verifying access changes

## Implementation
Steps outlined below.

### View current ownership and permissions
```bash
ls -l Accounting_Q1_2026.xlsx
```

### Change file owner and group
```bash
sudo chown username:tom@accounting Accounting_Q1_2026.xlsx
```

### Modify permissions (example: owner full, group read-only)
```bash
sudo chmod 640 example.txt
```

### Verification
```bash
ls -l example.txt
```
