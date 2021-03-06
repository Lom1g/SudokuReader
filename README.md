# Sudoku Reader

Application android permettant de scanner des grilles de sudoku et de faire une requête de résolution vers un serveur adapté.

### Pré-requis

Il faut lancer le serveur de résolution sur le même réseau que votre application

1. Cloner le serveur de résolution : https://github.com/killian-mahe/sudoku-reader
2. Suivre les indications d'installation du serveur
3. Installer le package flask
  ```sh
   pip install flask
   ```
4. Paramétrer le serveur
   ```sh
   $env:FLASK_APP = "server"
   ```
5. Lancer le serveur
  ```sh
   flask run --host=0.0.0.0
   ```


### Installation

- Cloner le projet sous Android Studio.
- Modifier la varaiable BASE_URL avec l'adresse ip du serveur et le port 5000
  ```sh
   private final static String BASE_URL = "yourIpServer:5000"
   ```
- Executer le projet dans un émulateur ou bien votre périphérique

## Démarrage

- Lancer l'application qui vient d'être installée
- Prendre en photo une grille de sudoku, à l'aide d'une pression sur le bouton en bas de l'écran

## Fabriqué avec

* [Android Studio](https://developer.android.com/studio) - Environnement de développement

## Versions

**Dernière version :** 1.0

## Auteurs

* **Nathan Cuvier-Péres** _alias_ [@Lom1g](https://github.com/Lom1g)

Les [contributeurs](https://github.com/Lom1g/SudokuReader/contributors).
