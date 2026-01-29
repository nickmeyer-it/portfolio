# Check Disk Usage and Filesystem Layout

## Scenario
Reviewed disk usage and filesystem layout to assess storage availability and mounted filesystems.

## Environment
- OS: Ubuntu Server 22.04
- Platform: VirtualBox VM
- Purpose: Skills demonstration lab

## Skills Demonstrated
- Viewing disk usage
- Identifying mounted filesystems
- Interpreting storage output
- Basic storage troubleshooting

## Implementation
Steps outlined below.

### Check disk usage by filesystem
```bash
df -h
```
<img width="1280" height="800" alt="2026-01-28 20_13_51-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/a6ac7bea-31d5-4b90-aa72-ac11deca4ed7" />

### View block devices and mount points
```bash
lsblk
```
<img width="1280" height="800" alt="2026-01-28 20_14_41-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/f6f68da8-0c67-44ac-9062-2c4d52f608b9" />

### Check directory-level disk usage
```bash
du -sh /
```
<img width="1280" height="800" alt="2026-01-28 20_22_19-UIMachineViewNormalClassWindow" src="https://github.com/user-attachments/assets/abda46c2-3065-46e5-90c8-d2de58832fae" />

### Verification
- Confirmed available disk space
- Identified root and any additional mounts
- Validated filesystem layout

### Reflection
Disk usage and filesystem layout were successfully reviewed using standard Linux utilities, demonstrating a routine administrative task used for capacity planning and troubleshooting.
