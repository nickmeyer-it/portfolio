# Renaming a 2019 Windows Server

## Environment
- OS: Windows Server 2019 (Evaluation)
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Familiarity with renaming a 2019 Windows Server

### 1. From Server Manager
- Select Local Server
- Left-click the Computer name property
<img width="1024" height="768" alt="2026-02-08 16_36_28-Clipboard" src="https://github.com/user-attachments/assets/54f3e0d7-ca78-499c-8063-845906965e0b" />

### 2. From System Properties
- Left-click the Change button
<img width="1024" height="768" alt="2026-02-08 16_37_06-Clipboard" src="https://github.com/user-attachments/assets/f0473bda-cd33-4ec8-8302-28d03e19fc95" />

### 3. From Computer Name/Domain Changes
- Left-click and select the current Computer name
- Replace the current name with the desired name
- Left-click the OK button when done to apply change
<img width="1024" height="768" alt="2026-02-08 16_37_58-Clipboard" src="https://github.com/user-attachments/assets/7a976837-1eeb-4bbf-95f2-34766e820017" />

<img width="1024" height="768" alt="2026-02-08 16_38_47-Clipboard" src="https://github.com/user-attachments/assets/f04f99e0-45b1-48bd-a690-1ad7ee1775f3" />

### 4. You must restart your computer to apply these changes
- Left-click the OK button
<img width="1024" height="768" alt="2026-02-08 16_39_49-Clipboard" src="https://github.com/user-attachments/assets/ffd98d43-5075-4369-9dc2-c50fad6a2dbf" />

### 5. Restart confirmation prompt
- Left-click the Restart Now button
<img width="1024" height="768" alt="2026-02-08 16_44_12-Clipboard" src="https://github.com/user-attachments/assets/4e5a9282-66ad-49ff-a2df-e33697d42d67" />

### 6. After the machine has restarted
- Open a CMD window
- Type:
```cmd
hostname
```
- Press the Enter key
- Should return the new computer/host name
- Nice!
<img width="1024" height="768" alt="2026-02-02 10_06_31-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/6f94e7c0-4af0-4bbc-acf5-06a78727be36" />
