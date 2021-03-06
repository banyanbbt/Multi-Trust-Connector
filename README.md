Multi-Trust-Connector
========

Multi-Trust Connector (MTC) is a technical solution for user data permission & authorization, which is the most important regularization related module in our data service network. MTC records every user data permission and writes the metadata (Merkle tree root node) into the blockchain. Ensuring the transparency, tamper resistance as well as privacy protection.


## What's included


Within the download you'll find the following directories and files, logically grouping common assets and providing both compiled and minified variations. You'll see something like this:


```
Multi-Trust-Connector/
├── cloud/
├── api/
├── sdk/
    ├── ios
    ├── android
    ├── js
    ├── java
    ├── python
```

There are three core modules of MTC

* Cloud: permission management SaaS tool
* API: authorization service API infrastructure
* SDK: HTTPs-based RESTful API packages


## Getting started


1. Cloud installation

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


2. Quick start of API

```
    sudo apt-get update

    sudo apt-get install openjdk-8-jdk

    echo "
        export JAVA_HOME=$(which java)
        export JRE_HOME=\${JAVA_HOME}/jre
        export CLASSPATH=.:\${JAVA_HOME}/lib:\${JRE_HOME}/lib
        export PATH=\${JAVA_HOME}/bin:\$PATH
        " | sudo tee -a /etc/profile

    source /etc/profile

    echo $JAVA_HOME
```


3. SDK features

Currently, SDK packages including iOS, Android and JavaScript versions for application developer, as well as the Java and Python versions for data supplier.


4. Follow the guidelines to start developing this application. You may find the following resources handy:

* [Banyan Network website](https://www.banyanbbt.org/)
* [Banyan Network Telegram](https://t.me/BBNGlobalFans)
* [The API Documentation](https://github.com/banyanbbt/Multi-Trust-Connector/blob/develop/api/README.md)
* [The SDK Guides](https://github.com/banyanbbt/Multi-Trust-Connector/blob/develop/sdk/README.md)


## Contributing

We encourage you to contribute to Multi-Trust Connector! [Join us!](https://www.banyanbbt.org/)

Everyone interacting in Multi-Trust Connector and its sub-projects' codebases, issue trackers, chat rooms, and mailing lists is expected to follow the MTC [code of conduct](https://www.banyanbbt.org/).


## License

Multi-Trust Connector is released under the [MIT License](https://opensource.org/licenses/MIT).


