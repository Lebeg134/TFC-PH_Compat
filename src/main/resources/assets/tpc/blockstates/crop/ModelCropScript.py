import json

croplist = ["broccoli", "celery", "chili_pepper", "coffeebean", "cucumber", "eggplant", "ginger", "grape", "lettuce", "mushroom", "mustardseeds", "peanut", "peas", "peppercorn", "radish", "scallion", "sesameseeds", "spiceleaf", "spinach", "sweetpotato", "tealeaf", "zucchini"]

for currentcrop in croplist:
    item = {
    "forge_marker": 1,
    "defaults": {
        "model": "cross",
        "textures": {
        "cross": "tpc:blocks/crop/spiceleaf_stage_0"
        }
    },
    "variants": {
        "normal": [
        {}
        ],
        "stage": {
        "0": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_0"
            }
        },
        "1": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_1"
            }
        },
        "2": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_2"
            }
        },
        "3": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_3"
            }
        },
        "4": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_4"
            }
        },
        "5": {
            "textures": {
            "cross": "tpc:blocks/crop/spiceleaf_stage_5"
            }
        }
        }
    }
    }
    print(item["defaults"]["model"])
    item["defaults"]["model"] = "crop" # replace cross
    
    curr = item["defaults"]["textures"]
    value = curr.pop("cross") # delete field cross
    value = value.replace("spiceleaf",currentcrop) #replace spiceleaf
    curr["crop"] = value # add new cross field
    
    print(item["defaults"]["model"])
    for stages in item["variants"]["stage"]:
        curr = item["variants"]["stage"][stages]["textures"]
        value = curr.pop("cross") # delete field cross
        value = value.replace("spiceleaf",currentcrop) #replace spiceleaf
        curr["crop"] = value # add new cross field
        print(value)
        print(curr["crop"])
        
        
    with open(currentcrop+'.json', 'w') as outfile:
        json.dump(item, outfile)
