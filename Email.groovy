class Email {
  String prospectName
  String emailAddress
  Date sendDate
  String notes

  String displayContent() {
    return "Recipient: $prospectName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $notes"
  }
}
