import json

croplist = ["broccoli", "celery", "chili_pepper", "coffeebean", "cucumber", "eggplant", "ginger", "grape", "lettuce", "mushroom", "mustardseeds", "peanut", "peas", "peppercorn", "radish", "scallion", "sesameseeds", "spiceleaf", "spinach", "sweetpotato", "tealeaf", "zucchini"]

for currentcrop in croplist:
    item = {
    "parent": "item/generated",
    "textures": {
        "layer0": "tfc_ph_compat:items/crop/seeds/spiceleaf"
    }
    }
    item["textures"]["layer0"]=item["textures"]["layer0"].replace("spiceleaf",currentcrop)
     
    with open(currentcrop+'.json', 'w') as outfile:
        json.dump(item, outfile)
