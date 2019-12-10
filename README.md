# StatusPlus

this is a plugin that manage and set the Player status, and exceeds the limit imposed by the server-sided config of JinRyuu mods.

### It is tested on
| Name | Version |
| --- | --- |
| KCauldron | 1448.143 |
| Thermos | Latest Version |

It has any bugs, and if you can contribute, will be of a great help!

# Getting Started

If you want to use this plugin, or help in the development, you can clone this project and build!

#### Build
```
mvn install
```

It will build the project, and publish it on **mavenLocal**.

You can get the plugin jar in ${project_folder}/target/StatusPlus-1.0.0-SNAPSHOT.jar

#### Setting Up for development

##### Maven
```xml
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
    </repositories>

    <dependency>
        <groupId>com.rafaelrain.statusplus</groupId>
        <artifactId>core</artifactId>
        <version>1.0-SNAPSHOT</version>
        <scope>compile</scope>
    </dependency>
```

##### Gradle
```groovy
    repositories {
	    maven { url 'https://jitpack.io' }
    }
    
    dependencies {
	    implementation 'com.github.RafaelrainBR:StatusPlus:master-SNAPSHOT'
    }
```

And this project has an Example project. Please check the code.
