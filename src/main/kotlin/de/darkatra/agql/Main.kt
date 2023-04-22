package de.darkatra.agql

fun main() {

    // v rising server
    val serverHostName = "51.195.60.73"
    val serverQueryPort = 24785

    for (i in 0 until 1000) {
        runCatching {

            val serverInfo = ServerQueryClient.getServerInfo(serverHostName, serverQueryPort)
            val players = ServerQueryClient.getPlayerList(serverHostName, serverQueryPort)
            val rules = ServerQueryClient.getRules(serverHostName, serverQueryPort)

            println("name: ${serverInfo.name}, players: ${players.size}, days-running: ${rules["days-runningv2"]}")
        }
    }
}
