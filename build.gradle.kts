plugins {
    java
    scala
    application
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("commons-io:commons-io:+")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClassName = "src/main/java/Hello.java"
}