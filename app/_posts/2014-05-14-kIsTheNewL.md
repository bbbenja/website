---
layout: post
title: k is the new l, yo
author: Matthieu
cover: kisthenewl-banner
tags: [zsh, git, shell]
---

`ls` est une des commandes shell les plus utilisées, pourtant depuis les années 70 elle a très peu changé. Bien sûr, il y a de nombreuses options, citons `ls -a` pour afficher les fichiers cachés, `ls -l` pour afficher plus d'informations, `ls --color` pour afficher deux couleurs, une pour les fichiers et une pour les répertoires, ou encore `ls -rtl` pour trier le contenu par date et afficher le plus récent en dernier.
<!--break-->

`ls` est donc une commande utile et pratique mais elle n'est pas folichonne. D'où la naissance de `k` qui a pour but de remplacer `ls` avec quelques killer features. Il ne s'agit pas d'une surcouche de `ls` mais d'une commande complète, s'appuyant directement sur `stat` par exemple. À ce jour, les nouvelles fonctionnalités sont les suivantes :

- intégration de git status sur un dépôt entier : rouge si le dépôt est "sale", vert sinon ;
- intégration de git status à l'intérieur d'un dépôt : différenciation des fichiers modifiés, non ajoutés ou ignorés ;
- dégradé de couleur pour la taille des fichiers : du vert pour les petits fichiers au rouge pour les gros ;
- dégradé de couleur pour la date de modification : plus la date est affichée en clair et plus le fichier est récent.

Voici un comparatif des deux rendus, version `ls` et version `k` :

<div style="text-align : center">
<a style="display: inline" href="/images/postKisTheNewL/lsalcolor.png" data-lightbox="image-0" title="version ls -al --color">
        <img class="medium" src="/images/postKisTheNewL/lsalcolor_min.png" alt="version k"/>
</a>
<a style="display: inline" href="/images/postKisTheNewL/k.png" data-lightbox="image-0" title="version k">
        <img class="medium" src="/images/postKisTheNewL/k_min.png" alt="version k"/>
</a>
</div>
<br/>


`k` est disponible uniquement pour zsh. Pour l'installer, il suffit de cloner le dépôt [git](https://github.com/supercrabtree/k) et d'ajouter `source ~/path/k/k.sh` dans son ~/.zshrc.
k est encore jeune mais il gagnerait à être connu, il manque quelques fonctions de base comme mettre un répertoire en paramètre ou ne pas afficher les fichiers cachés.
Pour en savoir plus, n'hésitez pas à aller voir la page [GitHub](https://github.com/supercrabtree/k).

Comme dit leur slogan : «k is the new l, yo».
