import json

foodlist = ["uncookedanchovypepperonipizzaItem","uncookedapplepieItem","uncookedbbqchickenpizzaItem","uncookedbiscuitItem","uncookedblackberrycobblerItem","uncookedblueberrymuffinItem","uncookedblueberrypieItem","uncookedbriochebunItem","uncookedbuttercookieItem","uncookedbuttertartItem","uncookedcaramelcupcakeItem","uncookedcarrotcupcakeItem","uncookedchaoscookieItem","uncookedcherrypieItem","uncookedchickenpotpieItem","uncookedchilicupcakeItem","uncookedchocolatecupcakeItem","uncookedcinnamonbreadItem","uncookedcinnamonrollItem","uncookedcoffeecupcakeItem","uncookedcottagepieItem","uncookedcrackerItem","uncookedcrackersItem","uncookedcroissantItem","uncookeddamperItem","uncookedeggtartItem","uncookedfruitcrumbleItem","uncookedgarlicchickenItem","uncookedgingerbreadItem","uncookedgingersnapsItem","uncookedgooseberrypieItem","uncookedhoneybunItem","uncookedhoneylemonlambItem","uncookedhoneysoyribsItem","uncookedlambwithmintsauceItem","uncookedlemonchickenItem","uncookedlemoncupcakeItem","uncookedmeatpieItem","uncookedmincepieItem","uncookedmintcupcakeItem","uncookedmochicakeItem","uncookedorangeduckItem","uncookedpeachcobbleritem","uncookedpeanutbuttercookiesItem","uncookedpeanutbuttercupcakeItem","uncookedpekingduckItem","uncookedpizzaItem","uncookedpumpkinbreadItem","uncookedpumpkinmuffinItem","uncookedpumpkinoatsconesItem","uncookedpumpkinpieItem","uncookedraisincookiesitem","uncookedraspberrypieItem","uncookedredvelvetcupcakeItem","uncookedricecakeItem","uncookedrivermudcakeItem","uncookedroastchickenItem","uncookedroastpotatoesItem","uncookedsalisburysteakItem","uncookedshepardspieItem","uncookedsoftpretzelItem","uncookedspinachpieItem","uncookedsprinklescupcakeItem","uncookedstrawberrycupcakeItem","uncookedstrawberrypieItem","uncookedstuffedduckItem","uncookedsugarcookieItem","uncookedsunflowerwheatrollsItem","uncookedsweetpotatopieItem","uncookedtimpanoItem","uncookedtiropitaItem","uncookedtoastItem","uncookedtomatoherbchickenItem","uncookedvanillacupcakeItem"]

for currentfood in foodlist:
    item = {
    "parent": "item/generated",
    "textures": {
        "layer0": "tfc_ph_compat:items/food/token"
    }
    }
    item["textures"]["layer0"]=item["textures"]["layer0"].replace("token",currentfood)
     
    with open(currentfood+'.json', 'w') as outfile:
        json.dump(item, outfile)
