# Linux

## Prerequisites

### Java

```shell
sudo apt-get update
sudo apt-get install openjdk-8-jdk
```

## Installing IntelliJ
 
1. Visit https://www.jetbrains.com/idea/download/#section=linux
2. You will be asked to choose between the community and ultimate editions. If you don't have a license for the ultimate edition go with the community edition.
3. Enter the following shell commands once you have finished download the .tar.gz file
 
```shell
sudo mkdir /opt/idea
sudo tar -xzf <FILENAME>.tar.gz -C /opt/idea/ --strip-components=1
sh /opt/idea/bin/idea.sh
```
 
 ## Installing Leiningen
 
 Leiningen is the package manager / project manager / all-around-make-your-life-better tool for working in Clojure. You will use it to manage dependencies to other libraries, create new projects, and run existing projects.
 
 To install it enter the following commands to download the latest version from github and make it executable.
 
```shell
sudo wget -cO /usr/bin/lein https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
sudo chmod a+x /usr/bin/lein
lein
```

[# Mac OS X]: # (TODO)

[# Windows]: # (TODO)

# Back to Everyone (Linux, Mac OS X, Window)
 
 ## Intermission: Creating your first Clojure project
 
 Creating a Clojure project with leiningen is easy. All leiningen commands are shortened to simply `lein`. Whenever you want to ask leiningen to do something you would just type in the shell `lein ...` and it will do it!
 
 For now, let's just create an blank Clojure project that we will open in IntelliJ soon.
 
 In your shell type the following to create a new project named hello-world. It will create a directory of that name.
  
```shell
 lein new hello-world
```
 
 Once complete you might see something like this!

 TODO:(lein.png)
 
 ## Installing Cursive
 
[Cursive](https://cursive-ide.com/) is a third-party plugin for IntelliJ that allows Clojure(script) development in the IDE. Please note, Cursive isn't free and will require a license following a thirty-day trial. It is the de-facto environment for working in Clojure in IntelliJ.

To install, we'll need to have IntelliJ open. If you don't have it already up, please start IntelliJ.

- Access the plugins pane. To do this, if you have no projects open in IntelliJ already you can navigate from the "Configure" button on the bottom right-hand corner and select "Plugins". If you have a project open click on File -> Settings. Once in the settings pane select plugins. You will now see a window that looks like this:

![Plugins view](/img/intellij/plugins.png)

- From there click on the "Browse repositories..." button on the bottom.
- In the next window that displays search for "Cursive" in the search bar at the top-left hand corner and click install once it displays.
- You will then be prompted to restart IntelliJ. Do so.
- Now let's load up the hello-world project you created earlier. Click on Import Project if you don't have any projects open, or navigate to File -> New Project from Existing Sources... if you have a project open.
- Navigate to where you have hello-world located and click OK.
- Next it will ask you where are you importing the project from. Select the following configuration

![Import project](/img/intellij/import.png)

- Press next until you reach a page where it asks you to select the project SDK. If you have one defined and want to use it select that one. Otherwise we will need to navigate to where we installed Java and the JDK earlier. Once this is configured continue pressing next.

![IntelliJ JDK selection](/img/intellij/jdk-intellij.png)

- Once you have finished the remaining steps your project should begin opening up. How exciting! You can already begin playing around with your first Clojure project. There are a few more steps you can take to make your experience in Clojure-land even better.

### REPL setup

![REPL 1](/img/intellij/repl-1.png)

![REPL 2](/img/intellij/repl-2.png)

![REPL 3](/img/intellij/repl-3.png)

![REPL 4](/img/intellij/repl-4.png)

### Defining shortcuts

You may notice after a while that you get tired of constantly right clicking to perform common actions in the editor that are powered by Cursive. You can specify custom shortcuts for these.

To do so click on File -> Settings. In the Settings menu, select "Keymap", then select "Clojure Keybindings." There you can choose predefined bindings or define your own for each of your commonly used keystrokes!

[TODO:()]: # (need a screenshot for shortcut definition)

### Indexing Repositories

You may notice this notification once the project loads appear in the bottom right-hand corner. 

![Unindexed repositories notification](/img/intellij/unindexed-repo.png)

If so, you may want to index maven and clojars. These are repositories (i.e. places where people store and access libraries) and you will be using them regularly in your projects. In fact, even Clojure and Clojurescript themselves are simply libraries!

![Where to index repos](/img/intellij/index-repos.png)\
