Multi-Trust-Connector Cloud Platform
========

MTC Cloud Platform is based on Ruby on Rails framework, it provides permission management SaaS tool.
It managed customers accounts and all the aggreements between the data suppliers, Application developer and the end users.


## Requirements


```

MTC supports Ruby 2.4.2+
All Rails releases >= 5.1.4 are officially supported.

MySQL 5.7.19 or greater is recommended.
Redis 3.2 or greater is required.

```


## Installation


```
    curl -L https://raw.githubusercontent.com/wayneeseguin/rvm/master/binscripts/rvm-installer | bash -s stable

    source ~/.profile

    rvm install 2.4.2

    rvm use 2.4.2 --default

    gem install bundler

    gem install rails --version=5.1.4

    sudo apt install mysql-server

    rake db:create

    rake db:migrate

    rake db:seed

    rails s
```

    Go to `http://localhost:3000` and you'll see the MTC cloud dashboard.

