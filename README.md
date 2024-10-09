```
classDiagram
    class User {
	-Long id
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }
    class Account {
	-Long id
        -String number
        -String agency
        -BigDecimal balance
    }
    class Feature {
        -Long id
	-String icon
        -String description
    }
    class Card {
        -Long id
	-String number
        -BigDecimal cardLimit
    }
    class News {
        -Long id
	-String icon
        -String description
    }
    User "1" -- "1" Account
    User "1" -- "0..*" Feature
    User "1" -- "1" Card
    User "1" -- "0..*" News

```