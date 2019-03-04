package blog

import org.springframework.data.repository.CrudRepository

/**
 * @author Emmanuel Duchastenier
 */
interface ArticleRepository : CrudRepository<Article, Long> {
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, String>