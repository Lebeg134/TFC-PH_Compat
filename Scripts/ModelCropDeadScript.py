import json

croplist = ["broccoli", "celery", "chili_pepper", "coffeebean", "cucumber", "eggplant", "ginger", "grape", "lettuce", "mushroom", "mustardseeds", "peanut", "peas", "peppercorn", "radish", "scallion", "sesameseeds", "spiceleaf", "spinach", "sweetpotato", "tealeaf", "zucchini"]

for currentcrop in croplist:
    item = {
    "forge_marker": 1,
    "defaults": {
        "model": "cross",
        "textures": {
        "cross": "tpc:blocks/crop/spiceleaf_dead"
        }
    },
    "variants": {
        "normal": [
        {}
        ],
        "mature": {
        "false": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_dead_young"
            }
        },
        "true": {}
        }
    }
    }
    item["defaults"]["model"] = "crop" # replace cross
    curr = item["defaults"]["textures"]
    value = curr.pop("cross") # delete field cross
    value = value.replace("spiceleaf",currentcrop) #replace spiceleaf
    curr["crop"] = value # add new cross field
    
    
    curr = item["variants"]["mature"]["false"]["textures"]
    value = curr.pop("cross") # delete field cross
    value = value.replace("spiceleaf",currentcrop) #replace spiceleaf
    curr["crop"] = value # add new cross field
    
        
    with open(currentcrop+'.json', 'w') as outfile:
        json.dump(item, outfile)
