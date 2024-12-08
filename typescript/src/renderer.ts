import { Rectangle } from "./shapes/rectangle.js";

function Renderer(shape: Shape) {
    const area = shape.computeArea();
    return {
        draw() {
            console.log("Shape drawn\n" + "Its area is " + area);
        }
    }
}

export {Renderer }