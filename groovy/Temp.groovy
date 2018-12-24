// testCase = context.testCase

def randomEmail(String domain) {
    return randomUserName("user-") + "@" + domain
}

def randomUserName(String prefix) {
    Random rand = new Random()
    def alphaNumPool = ['a'..'z', 0..9].flatten()
    def randomChars = (0..6).collect { alphaNumPool[rand.nextInt(alphaNumPool.size())] }
    return prefix + randomChars.join()
}

println randomUserName("user-")
println randomEmail("example.com")

//testSuite.setPropertyValue("newUserName", randomUserName("user-"))
//System.out << "${#testSuite#newUserName}"
//log.info "${#TestCase#newUserName}"
