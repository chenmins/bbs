package org.chenmin

//回帖
class TopicReply {
    //用户
    User user
    //正文
    String body
    //最佳
    boolean good = false
    //发布
    Date releaseDate = new Date()

    int praise = 0

    static belongsTo = [topic: Topic]

    static mapping = {
        table('fly_topic_reply')
    }

    static constraints = {
    }
}
