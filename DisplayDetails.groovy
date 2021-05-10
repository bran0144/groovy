Email email = new Email()

email.prospectName = "Leaky Pipes Plumbing"
email.emailAddress = "joe@leakypipes.com"
email.sendDate = new Date()
email.notes = "Sent Joe a list of pricing options for his spring ad campaign"

println email.displayContent()
