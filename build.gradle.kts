plugins {
    java
    application
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("commons-io:commons-io:+")
}
application {
    mainClassName = "src/main/java/Hello.java"
}