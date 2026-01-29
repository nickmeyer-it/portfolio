# Verify Running Services on a Linux System

## Scenario
Checked the status of system services to confirm they are running as expected and responding correctly.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Viewing service status
- Starting and stopping services
- Verifying active services
- Basic service troubleshooting

## Implementation
Steps outlined below.

### List running services
```bash
systemctl list-units --type=service --state=running
```
<img width="1280" height="800" alt="2026-01-28 20_36_23-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/1169f5ca-13e2-48f8-8ce1-fc6e7c70ceb2" />

### Check status of a specific service
```bash
systemctl status ssh
```
<img width="1280" height="800" alt="2026-01-28 20_41_01-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/f5c7fd1a-9729-44c1-ac1b-bd9ad33c9fb2" />

### Start and stop a service
```bash
sudo systemctl stop ssh
sudo systemctl start ssh
```
<img width="1280" height="800" alt="2026-01-28 20_42_24-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/13fa318c-8623-43ad-b759-bfcf97776dac" />
<img width="1280" height="800" alt="2026-01-28 20_43_06-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/383fb1fd-3cea-489c-99bb-06224bdde67f" />

### Enable service at boot (optional)
```bash
sudo systemctl enable ssh
```
<img width="1280" height="800" alt="2026-01-28 20_43_43-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/df9e5deb-2f8e-4522-8e80-8336679ab1d6" />

### Verification
- Confirmed service status changed as expected
- Verified service returned to an active state after restart

### Reflection
Service status was successfully verified and managed using systemctl, demonstrating a routine administrative task used to ensure system availability and reliability.
