<template>
    <div>
        <v-card style="width:300px; margin-left:5%;" outlined>
            
            <v-card-title>
                Photo
            </v-card-title>
            <v-card-text style = "margin-left:-15px; margin-top:10px;">
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Id" v-model="value.id"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Id :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Name" v-model="value.name"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Name :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Url" v-model="value.url"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Url :  
                </div>
                
            </v-card-text>
        
        </v-card>
    </div>
</template>

<script>
export default {
    name:"Photo",
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