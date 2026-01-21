# Create a Shared Directory with Least Privilege

## Scenario
Simulated creating a shared directory for a team where only authorized users can access and modify files.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Group creation and management
- Directory ownership and permissions
- Least-privilege access control
- Access verification

## Implementation
Steps outlined below.

### Create an account for Tom in Accounting
```bash
sudo useradd -m tom@accounting
```

### Set a password for Tom's new account
```bash
sudo passwd tom@accounting
```
<img width="1280" height="800" alt="2026-01-20 20_29_44-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/9e00e4cb-222d-4ade-ac7c-36b86233567f" />

### Add an Accounting group
```bash
sudo groupadd accounting
```

### Add Tom to the Accounting group
```bash
sudo usermod -aG accounting tom@accounting
```
<img width="1280" height="800" alt="2026-01-20 20_32_20-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/0e72a643-d9e7-47e8-a112-5485546af21d" />

### Make an a folder for Accounting under the root directory (/)
```bash
sudo mkdir /accounting
```

### Make the Accounting group the owner of the new '/accounting' folder
```bash
sudo chown :accounting /accounting
```

### Make sure the file system permissions for '/accounting' allow group read, write and execute. (770)
```bash
sudo chmod 770 /accounting
```
<img width="1280" height="800" alt="2026-01-20 20_38_39-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/f8a3642a-c854-4323-9cac-040524e9397a" />

### Test file system access using (ls /accounting), verify (newuser) doesn't have access (receives error) and that (tom@accounting) does have access (no error received)
```bash
su - newuser
ls /accounting
su - tom@accounting
ls /accounting
```
<img width="1280" height="800" alt="2026-01-20 20_41_40-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/1e3e8047-b207-4656-b066-2405ce99466e" />
