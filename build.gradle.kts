import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
    id("net.minecrell.licenser") version "0.4.1"
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

group = "eu.mikroskeem"
version = "0.0.1-SNAPSHOT"

val paperApiVersion = "1.13.2-R0.1-SNAPSHOT"
val protocolLibVersion = "4.4.0-SNAPSHOT"
val shurikenVersion = "0.0.1-SNAPSHOT"
val missingNoVersion = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()

    maven("http://repo.dmulloy2.net/content/groups/public/")
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.wut.ee/repository/mikroskeem-repo/")
}


dependencies {
    // Plugin dependencies
    implementation(kotlin("stdlib-jdk8"))
    implementation("eu.mikroskeem:shuriken.instrumentation:$shurikenVersion")
    implementation("eu.mikroskeem.missingno:bukkit:$missingNoVersion")

    // Platform
    compileOnly("com.destroystokyo.paper:paper-api:$paperApiVersion")
    compileOnly("com.comphenix.protocol:ProtocolLib:$protocolLibVersion")
}

bukkit {
    name = "TowelDisguise"
    main = "eu.mikroskeem.toweldisguise.TowelDisguise"
    description = "The disguise plugin which actually doesn't suck"
    authors = listOf("mikroskeem")
    website = "https://github.com/mikroskeem/TowelDisguise"
    depend = listOf("ProtocolLib")
}

license {
    header = rootProject.file("etc/HEADER")
    filter.include("**/*.kt")
    filter.include("**/*.java")
}

val compileKotlin by tasks.getting(KotlinCompile::class) {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

val shadowJar by tasks.getting(ShadowJar::class) {
    val target = "eu.mikroskeem.toweldisguise.lib"
    val relocations = listOf(
            "kotlin",
            "eu.mikroskeem.shuriken"
    )

    relocations.forEach {
        relocate(it, "$target.$it")
    }
}