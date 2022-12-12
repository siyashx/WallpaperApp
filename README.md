# WallpaperApp
Hello. Wallpaper application is written in kotlin and integrated with firebase. Within the application, you can choose both the home screen, the lock screen, or both. I would like to share the application with an easy interface with you.

Working the project with firestore and firebase storage. Just do the following before running it..

1. Create a firebase account and new project.
2. Just put google-services.json in app folder
3. Enable firebase storage and firestore
4. Create "Catalogs", "Categories", "recentuploaded" in both firebase storage and firestore
5. Add document "Spiderman", "Depth Effect", "Minimal", "Nature", "Space" in catalog (firebase storage and firestore)
6. Build whole Firestore model like this.  Example: 

Spiderman Document
    id: Spiderman
    link: Cover image in Firebase storage Catalogs->Spiderman->Download Url for image

7. Add document "Abstract", "Amoled", "Anime", "Exclusive", "Games", "Gradient", "Minimal", "Nature", "Shapes", "Shows", "Sports", "Stocks", "Superheroes" in categories
(Firebase storage and firestore)

8. Create model. Example:

Abstract Document
    id: Abstract
    link: Cover image in Firebase storage Categories-> Abstract-> Download Url for image
    
    
That is all. You can control half of the application from the admin panel.



  
