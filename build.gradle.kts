// Plugins
plugins { id("me.philippheuer.configuration") version "0.12.0" }

version = properties["version"] as String

// All-Projects
allprojects {
    apply(plugin = "me.philippheuer.configuration")

    // Repositories
    repositories { mavenCentral() }

    projectConfiguration {
        language.set(me.philippheuer.projectcfg.domain.ProjectLanguage.JAVA)
        type.set(me.philippheuer.projectcfg.domain.ProjectType.LIBRARY)
        javaVersion.set(JavaVersion.VERSION_1_8)
        lombokVersion.set("1.18.34")
        artifactGroupId.set("com.github.philippheuer.events4j")
    }

    dependencies {
        api(platform("io.github.xanthic.cache:cache-bom:0.6.0"))
        api("io.github.xanthic.cache:cache-core:0.6.0")
        implementation("com.github.twitch4j:twitch4j-util:1.21.0")
        mplementation("com.github.philippheuer.events4j:events4j-core:0.12.2")
    }
}
