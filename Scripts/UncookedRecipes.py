import json, os

input_dir = 'input'
whitelist = ["anchovypepperonipizzaitem","applepieitem","bbqchickenpizzaitem","biscuititem","blackberrycobbleritem","blueberrymuffinitem","blueberrypieitem","briochebunitem","buttercookieitem","buttertartitem","caramelcupcakeitem","carrotcupcakeitem","chaoscookieitem","cherrypieitem","chickenpotpieitem","chilicupcakeitem","chocolatecupcakeitem","cinnamonbreaditem","cinnamonrollitem","coffeecupcakeitem","cottagepieitem","crackeritem","crackersitem","croissantitem","damperitem","eggtartitem","fruitcrumbleitem","garlicchickenitem","gingerbreaditem","gingersnapsitem","gooseberrypieitem","honeybunitem","honeylemonlambitem","honeysoyribsitem","lambwithmintsauceitem","lemonchickenitem","lemoncupcakeitem","meatpieitem","mincepieitem","mintcupcakeitem","mochicakeitem","orangeduckitem","peachcobbleritem","peanutbuttercookiesitem","peanutbuttercupcakeitem","pekingduckitem","pizzaitem","pumpkinbreaditem","pumpkinmuffinitem","pumpkinoatsconesitem","pumpkinpieitem","raisincookiesitem","raspberrypieitem","redvelvetcupcakeitem","rivermudcakeitem","roastchickenitem","roastpotatoesitem","salisburysteakitem","shepardspieitem","softpretzelitem","spinachpieitem","sprinklescupcakeitem","strawberrycupcakeitem","strawberrypieitem","stuffedduckitem","sugarcookieitem","sunflowerwheatrollsitem","sweetpotatopieitem","timpanoitem","tiropitaitem","toastitem","tomatoherbchickenitem","vanillacupcakeitem"]


for filename in os.listdir(input_dir):
    f = open(input_dir+"/"+filename, "r")
    if filename.split(".")[1] == "json" :
        with open(input_dir+"/"+filename) as json_file:
            data = json.load(json_file)
            selected = False
            if data["result"]["item"].split(":")[1] in whitelist:
                data["result"]["item"]=data["result"]["item"].replace("harvestcraft:", "tfc_ph_compat:food/uncooked")
                selected = True
            if selected:
                with open("output/uncooked"+filename, "w") as outfile:
                    json.dump(data, outfile)
    f.close()