from Python import Fan
import Light

# Simulating appliance control
if __name__ == "__main__":
    fan = Fan()
    light = Light()

    print("Turning appliances ON:")
    fan.turn_on()
    light.turn_on()

    print("\nTurning appliances OFF:")
    fan.turn_off()
    light.turn_off()