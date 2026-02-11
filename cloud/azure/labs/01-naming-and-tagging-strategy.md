# Lab 01 – Azure Naming Convention & Tagging Strategy

## Objective

Design and document a consistent Azure naming convention and tagging strategy that:

- Supports cost management
- Supports governance and policy
- Scales across environments
- Aligns with AZ-900 conceptual domains
- Prepares for AZ-104 operational enforcement

This lab focuses on design decisions before scale.

---

## Scope of This Lab

This lab will:
- Define naming standards
- Define tag taxonomy
- Apply tags to a resource group
- Optionally validate tagging behavior on a VM
- Reflect on governance implications

This lab will NOT:
- Deploy production-scale resources
- Create unnecessary billable services

---

# Part 1 – Naming Convention Design

## 1.1 Define Naming Structure

Decide on a naming pattern format.

AZ-104-friendly:

| Resource | Prefix |
|:--------|:------|
| Resource Group | rg |
| Virtual Machine | vm |
| Virtual Network	| vnet |
| Subnet | snet |
| Network Security Group | nsg |
| Storage Account | st |
| Log Analytics	| law |
| Recovery Vault | rsv |

My chosen structure: 
```yaml
<resource-type>-<purpose>-<environment>
```
# (W.I.P.)
