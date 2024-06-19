class Book (var name: String, var author: String, var pages: Int, var genre: String) {

    override fun toString(): String {
        return "$name by $author"
    }

}