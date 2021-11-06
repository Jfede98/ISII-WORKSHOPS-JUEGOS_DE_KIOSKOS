Feature: Calculate the insurance prime for a customer

Scenario Outline: the customer is age year old maritalStatus sex with a haveLicense
	Given the customer is a <age> year old
	And the customer is "<maritalStatus>"
	And the customer is a "<sex>"
	And the customer has a "<haveLicense>"
	When calculate the premium
	Then show <premium>
	
Examples:
| age | maritalStatus | sex | haveLicense | premium |
| 45 | married | man | license | 200 |
| 23 | single | man | license | 2000 |

