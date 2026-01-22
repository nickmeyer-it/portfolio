# Granting Sudo group read, write, and execute permissions to the (/accounting) folder

## Scenario
Simulated granting the members of the Sudo group read, write, and execute permissions to the recently created (/accounting) folder.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Find out that Sudo member is unable to list contents of (/accounting)
- Show that Nick is a member of Sudo group
- Show that Accounting group is owner group of (/accounting)
- Change permissions of (/accounting) to allow Sudo members read, write, and execute
- Confirm Sudo member now able to list contents of (/accounting)
- Show that Accounting group is still the owner group of (/accounting)
- Verify Sudo group has same permissions to (/accounting) as the Accounting group does

## Implementation
Steps outlined below.

### Attempt to list contents of (/accounting) as Sudo group memmber
```bash
ls /accounting
```

### Confirm member of Sudo group, then confirm Accounting group still owner group of (/accounting)
```bash
groups nick
ls -ld /accounting
```

### Grant Sudo group read, write, and execute permissions of (/accounting) then confirm can list contents now
```bash
sudo setfacl -m g:sudo:rwx /accounting
ls /accounting
```

### Verification
```bash
ls -ld /accounting
getfacl /accounting
```
<img width="1280" height="800" alt="2026-01-21 21_50_45-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/dba0e00e-c5e5-481a-b0c7-0cc6500b7730" />
