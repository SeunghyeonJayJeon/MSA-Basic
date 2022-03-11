<template>
    <div>
        <v-card style="width:300px; margin-left:5%;" outlined>
            
            <v-card-title>
                Address
            </v-card-title>
            <v-card-text style = "margin-left:-15px; margin-top:10px;">
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Street" v-model="value.street"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Street :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="City" v-model="value.city"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    City :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="State" v-model="value.state"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    State :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="ZipCode" v-model="value.zipcode"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    ZipCode :  
                </div>
            </v-card-text>
        
        </v-card>
    </div>
</template>

<script>
export default {
    name:"Address",
    props: {
        editMode: Boolean,
        value : Object,
    },

    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),
    
}
</script>

<style scoped>
    .address-v-card-title {
        display: contents;
    }
    .address-v-text-field {
        margin-top:5px;
    }
</style>