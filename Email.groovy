class Email {
  String prospectName
  String emailAddress
  Date sendDate
  String notes

  def displayContent() {
    println "Recipient: $prospectName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $notes"
  }
}
