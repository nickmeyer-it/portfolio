# Create a Linux User with Basic Access

## Scenario
Simulated onboarding a new Linux user and ensuring they have basic user privileges only.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Listing existing system users
- Creating a new user with a home directory
- Verifying group membership
- Confirming no elevated privileges

## Implementation - steps outlined below

### List current users
cut -d: -f1 /etc/passwd
<img width="1280" height="800" alt="2026-01-18 22_16_17-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/9a2ae8a2-d477-4958-84d4-6c27167a9dcb" />
<img width="1280" height="800" alt="2026-01-18 22_19_06-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/01326d3c-e5af-4ac1-8566-debc5ea44837" />

# Alternatively...
getent passwd
<img width="1280" height="800" alt="2026-01-18 22_19_47-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/de6f5e16-52d6-470d-aec1-1e0b4709931b" />
<img width="1280" height="800" alt="2026-01-18 22_20_09-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/f13d79ce-1e20-4095-8c1f-ca46c032627f" />

### Add a new user
sudo useradd -m newuser
sudo passwd newuser

### Verify groups and privileges - output should show only newuser group, no sudo privileges.
groups newuser

#### Optional: test sudo permission - should return “permission denied”, so just confirming basic access.
su - newuser
sudo ls /root
<img width="1280" height="800" alt="2026-01-18 22_27_35-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/ba830dc4-fd9e-4e2b-8982-53932c2b1e31" />

